
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
    "offerInfo",
    "userInfo",
    "offers"
})
public class HotelOffers implements Serializable
{

    @JsonProperty("offerInfo")
    private OfferInfo offerInfo;
    @JsonProperty("userInfo")
    private UserInfo userInfo;
    @JsonProperty("offers")
    private Offers offers;
    private final static long serialVersionUID = -4337559745157406608L;

    @JsonProperty("offerInfo")
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    @JsonProperty("offerInfo")
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    @JsonProperty("userInfo")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(offerInfo).append(userInfo).append(offers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelOffers) == false) {
            return false;
        }
        HotelOffers rhs = ((HotelOffers) other);
        return new EqualsBuilder().append(offerInfo, rhs.offerInfo).append(userInfo, rhs.userInfo).append(offers, rhs.offers).isEquals();
    }

}
