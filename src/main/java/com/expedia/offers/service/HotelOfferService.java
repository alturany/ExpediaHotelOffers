package com.expedia.offers.service;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.expedia.offers.command.HotelOfferSearchCommand;
import com.expedia.offers.json.model.Hotel;
import com.expedia.offers.json.model.HotelOffers;
import com.expedia.offers.json.model.Offers;

@Component
public class HotelOfferService {

	private final RestTemplate restTemplate;

	public HotelOfferService() {
		this.restTemplate = new RestTemplate();
	}

	public List<Hotel> search(HotelOfferSearchCommand command) {
		List<Hotel> result = new ArrayList<Hotel>();

		try {
			String uri = command.buildRestUri();

			HotelOffers hotelOffers = restTemplate.getForObject(uri, HotelOffers.class);
			if (hotelOffers != null) {
				Offers offers = hotelOffers.getOffers();
				if (offers != null && offers.getHotel() != null) {
					result = offers.getHotel();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
