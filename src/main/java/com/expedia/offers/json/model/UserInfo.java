
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
    "persona",
    "userId"
})
public class UserInfo implements Serializable
{

    @JsonProperty("persona")
    private Persona persona;
    @JsonProperty("userId")
    private String userId;
    private final static long serialVersionUID = -2251265308513137086L;

    @JsonProperty("persona")
    public Persona getPersona() {
        return persona;
    }

    @JsonProperty("persona")
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(persona).append(userId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserInfo) == false) {
            return false;
        }
        UserInfo rhs = ((UserInfo) other);
        return new EqualsBuilder().append(persona, rhs.persona).append(userId, rhs.userId).isEquals();
    }

}
