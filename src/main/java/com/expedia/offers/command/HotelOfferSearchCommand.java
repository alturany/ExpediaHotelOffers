package com.expedia.offers.command;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Function;

import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.util.UriComponentsBuilder;

public class HotelOfferSearchCommand {

	public static final String DATE_FORMAT = "yyyy-MM-dd";
	private String destinationName;

	private String destinationCity;

	@DateTimeFormat(pattern = DATE_FORMAT)
	private Date minTripStartDate;

	@DateTimeFormat(pattern = DATE_FORMAT)
	private Date maxTripStartDate;

	private Integer lengthOfStay;

	private Integer minStarRating;

	private Integer maxStarRating;

	private Integer minTotalRate;

	private Integer maxTotalRate;

	private Integer minGuestRating;

	private Integer maxGuestRating;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Integer getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(Integer minStarRating) {
		this.minStarRating = minStarRating;
	}

	public Integer getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(Integer maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public Integer getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(Integer minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public Integer getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(Integer maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public Integer getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(Integer minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public Integer getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(Integer maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	class RestQueryParam {
		String paramName;
		String paramValue;

		public String getParamName() {
			return paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}

		public String getParamValue() {
			return paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
	}

	/**
	 * This method builds rest service URI based on properties populated into
	 * command. reflection has been used to avoid properties names hard coding,
	 * also it will discover properties dynamically, so adding a new property to
	 * command will be easy since no change to this method would be needed
	 * 
	 * @return
	 * @throws Exception
	 */
	public String buildRestUri() throws Exception {
		final UriComponentsBuilder uriBuilder = createHotelUriBuilder();

	
		PropertyDescriptor[] propDescArray = BeanUtils.getPropertyDescriptors(getClass());
		for (PropertyDescriptor propDesc : propDescArray) {

			String propName = propDesc.getName();
			if (!propName.equals("class")) {
				Method getPropMethod = propDesc.getReadMethod();
				Object propValue = getPropMethod.invoke(this);
				if (propValue != null) {
					if (propValue instanceof Date)
						propValue = ":"+new SimpleDateFormat(DATE_FORMAT).format(propValue);
		            uriBuilder.queryParam(propDesc.getName(), propValue);
				}
			}
        }

		return uriBuilder.build().toUriString();
	}

	
	
	/**
	 * This method does exactly the same as buildRestUri, but it's implemented in functional way
	 * 
	 */
	public String functionalBuildRestUri() throws Exception {

		final UriComponentsBuilder uriBuilder = createHotelUriBuilder();
		
		Arrays.stream(BeanUtils.getPropertyDescriptors(getClass()))
		      .filter(propDesc -> !propDesc.getName().equals("class"))
		      .map(propDesc -> {
		    	  try {
						Object value= propDesc.getReadMethod().invoke(HotelOfferSearchCommand.this);
						return new AbstractMap.SimpleImmutableEntry<>(propDesc.getName(), value);
					} catch (ReflectiveOperationException  e) {
						e.printStackTrace();
						throw new RuntimeException(e);
					} 
		         }
		      )
		      .filter(e -> e.getValue() != null)
			  .map(e ->  e.getValue() instanceof Date? new AbstractMap.SimpleImmutableEntry<>(e.getKey(), ":"+new SimpleDateFormat(DATE_FORMAT).format(e.getValue())):e)
			  .forEach(entry -> uriBuilder.queryParam(entry.getKey(), entry.getValue()));
		
		return uriBuilder.build().toUriString();
	}
	
	private UriComponentsBuilder createHotelUriBuilder() {
		final UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance().scheme("https")
				.host("offersvc.expedia.com").path("/offers/v2/getOffers").queryParam("scenario", "deal-finder")
				.queryParam("page", "foo").queryParam("uid", "foo").queryParam("productType", "Hotel");
		return uriBuilder;
	}

}
