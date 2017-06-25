
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
    "personaType"
})
public class Persona implements Serializable
{

    @JsonProperty("personaType")
    private String personaType;
    private final static long serialVersionUID = -3904353596405171738L;

    @JsonProperty("personaType")
    public String getPersonaType() {
        return personaType;
    }

    @JsonProperty("personaType")
    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personaType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Persona) == false) {
            return false;
        }
        Persona rhs = ((Persona) other);
        return new EqualsBuilder().append(personaType, rhs.personaType).isEquals();
    }

}
