package com.expedia.offers.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.expedia.offers.Application;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={Application.class})
@WebMvcTest(HomePageController.class)
public class HomePageControllerTest {

	@Autowired
	private MockMvc mockMvc;

//	@MockBean
//	HotelOfferService hotelOfferService;
	
	@Test
	public void getShouldReturnHomePage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string(containsString("Expedia Hotel Offers Search")));
	}

	@Test
	public void nothingFoundResult() throws Exception {
		this.mockMvc.perform(post("/").param("destinationCity", "Fake City")).andDo(print()).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
}
