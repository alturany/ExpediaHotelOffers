package com.expedia.offers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.expedia.offers.command.HotelOfferSearchCommand;
import com.expedia.offers.json.model.Hotel;
import com.expedia.offers.service.HotelOfferService;

@Controller
public class HomePageController {


	private HotelOfferService hotelOfferService;

	@Autowired
	public HomePageController(HotelOfferService hotelService) {
		this.hotelOfferService = hotelService;
	}

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("hotelOfferSearchCommand", new HotelOfferSearchCommand());
		return "homePage";
	}

	@PostMapping("/")
	public String homeSearchPost(@ModelAttribute HotelOfferSearchCommand command,Model model) {
		List<Hotel> hotels = hotelOfferService.search(command);
		model.addAttribute("hotelsList", hotels);
		return "hotelOfferSearchResult";
	}
}
