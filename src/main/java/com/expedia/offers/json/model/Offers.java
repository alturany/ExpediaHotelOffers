
package com.expedia.offers.json.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Hotel"
})
public class Offers implements Serializable
{

    @JsonProperty("Hotel")
    private List<Hotel> hotel = null;
    private final static long serialVersionUID = -8250361582294087494L;

    @JsonProperty("Hotel")
    public List<Hotel> getHotel() {
        return hotel;
    }

    @JsonProperty("Hotel")
    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hotel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Offers) == false) {
            return false;
        }
        Offers rhs = ((Offers) other);
        return new EqualsBuilder().append(hotel, rhs.hotel).isEquals();
    }

}
