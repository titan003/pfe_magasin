package org.alioune.pfe.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
@JsonIgnoreProperties(ignoreUnknown=true)
public class Address {

    private String street;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;

    public Address() {}

}