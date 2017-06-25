
package com.expedia.offers.json.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerDateRange",
    "destination",
    "hotelInfo",
    "hotelUrgencyInfo",
    "hotelPricingInfo",
    "hotelUrls",
    "hotelScores"
})
public class Hotel implements Serializable
{

    @JsonProperty("offerDateRange")
    private OfferDateRange offerDateRange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("hotelInfo")
    private HotelInfo info;
    @JsonProperty("hotelUrgencyInfo")
    private HotelUrgencyInfo hotelUrgencyInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfo hotelPricingInfo;
    @JsonProperty("hotelUrls")
    private HotelUrls hotelUrls;
    @JsonProperty("hotelScores")
    private HotelScores hotelScores;
    private final static long serialVersionUID = -1242301385984573616L;

    @JsonProperty("offerDateRange")
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    @JsonProperty("offerDateRange")
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("hotelInfo")
    public HotelInfo getInfo() {
        return info;
    }

    @JsonProperty("hotelInfo")
    public void setInfo(HotelInfo hotelInfo) {
        this.info = hotelInfo;
    }

    @JsonProperty("hotelUrgencyInfo")
    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    @JsonProperty("hotelUrgencyInfo")
    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    @JsonProperty("hotelUrls")
    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    @JsonProperty("hotelUrls")
    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    @JsonProperty("hotelScores")
    public HotelScores getHotelScores() {
        return hotelScores;
    }

    @JsonProperty("hotelScores")
    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(offerDateRange).append(destination).append(info).append(hotelUrgencyInfo).append(hotelPricingInfo).append(hotelUrls).append(hotelScores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hotel) == false) {
            return false;
        }
        Hotel rhs = ((Hotel) other);
        return new EqualsBuilder().append(offerDateRange, rhs.offerDateRange).append(destination, rhs.destination).append(info, rhs.info).append(hotelUrgencyInfo, rhs.hotelUrgencyInfo).append(hotelPricingInfo, rhs.hotelPricingInfo).append(hotelUrls, rhs.hotelUrls).append(hotelScores, rhs.hotelScores).isEquals();
    }

}
