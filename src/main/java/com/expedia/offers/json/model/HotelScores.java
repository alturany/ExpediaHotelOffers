
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
    "rawAppealScore",
    "movingAverageScore"
})
public class HotelScores implements Serializable
{

    @JsonProperty("rawAppealScore")
    private Double rawAppealScore;
    @JsonProperty("movingAverageScore")
    private Double movingAverageScore;
    private final static long serialVersionUID = -1781461161528503955L;

    @JsonProperty("rawAppealScore")
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    @JsonProperty("rawAppealScore")
    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @JsonProperty("movingAverageScore")
    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    @JsonProperty("movingAverageScore")
    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rawAppealScore).append(movingAverageScore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelScores) == false) {
            return false;
        }
        HotelScores rhs = ((HotelScores) other);
        return new EqualsBuilder().append(rawAppealScore, rhs.rawAppealScore).append(movingAverageScore, rhs.movingAverageScore).isEquals();
    }

}
