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

		assertEquals("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationCity=Amman", command.buildRestUri());
	}
	
	@Test
	public void buildUriDestinationName() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		command.setDestinationName("Amman");

		assertEquals("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=Amman", command.buildRestUri());
	}

	
	@Test
	public void buildUriMinTripStartDate() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		Date date = eidFitrDate();
		
		command.setMinTripStartDate(date);

		assertEquals("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&minTripStartDate=:2017-06-25", command.buildRestUri());
	}
	
	@Test
	public void buildUriMinTripStartDateAndDestinationName() throws Exception {
		HotelOfferSearchCommand command = new HotelOfferSearchCommand();
		Date date = eidFitrDate();
		
		command.setMinTripStartDate(date);
		command.setDestinationName("Amman");
		
		assertEquals("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=Amman&minTripStartDate=:2017-06-25", command.buildRestUri());
	}

	private Date eidFitrDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(2017,5, 25);
		Date date = cal.getTime();
		return date;
	}
}
