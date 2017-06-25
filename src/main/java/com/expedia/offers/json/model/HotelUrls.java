
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
    "hotelInfositeUrl",
    "hotelSearchResultUrl"
})
public class HotelUrls implements Serializable
{

    @JsonProperty("hotelInfositeUrl")
    private String hotelInfositeUrl;
    @JsonProperty("hotelSearchResultUrl")
    private String hotelSearchResultUrl;
    private final static long serialVersionUID = 4293485888588897298L;

    @JsonProperty("hotelInfositeUrl")
    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    @JsonProperty("hotelInfositeUrl")
    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    @JsonProperty("hotelSearchResultUrl")
    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hotelInfositeUrl).append(hotelSearchResultUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelUrls) == false) {
            return false;
        }
        HotelUrls rhs = ((HotelUrls) other);
        return new EqualsBuilder().append(hotelInfositeUrl, rhs.hotelInfositeUrl).append(hotelSearchResultUrl, rhs.hotelSearchResultUrl).isEquals();
    }

}
