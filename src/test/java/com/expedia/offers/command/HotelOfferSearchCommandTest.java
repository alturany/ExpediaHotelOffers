package com.expedia.offers.command;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class HotelOfferSearchCommandTest {

	@Test
	public void buildUriDestinationCity() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		command.setDestinationCity("Amman");

		final String expectedURI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationCity=Amman";
		assertEquals(expectedURI, command.buildRestUri());
		assertEquals(expectedURI, command.functionalBuildRestUri());
	}
	
	@Test
	public void buildUriDestinationName() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		command.setDestinationName("Amman");

		final String expectedURI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=Amman";
		assertEquals(expectedURI, command.buildRestUri());
		assertEquals(expectedURI, command.functionalBuildRestUri());
	}

	
	@Test
	public void buildUriMinTripStartDate() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		Date date = eidFitrDate();
		
		command.setMinTripStartDate(date);

		final String expectedURI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&minTripStartDate=:2017-06-25";
		assertEquals(expectedURI, command.buildRestUri());
		assertEquals(expectedURI, command.functionalBuildRestUri());
	}
	
	@Test
	public void buildUriMinTripStartDateAndDestinationName() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		Date date = eidFitrDate();
		
		command.setMinTripStartDate(date);
		command.setDestinationName("Amman");
		
		String expectedURI = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=Amman&minTripStartDate=:2017-06-25";
		assertEquals(expectedURI, command.buildRestUri());
		assertEquals(expectedURI, command.functionalBuildRestUri());
	}

	private Date eidFitrDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(2017,5, 25);
		Date date = cal.getTime();
		return date;
	}
}
