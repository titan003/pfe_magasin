package org.alioune.pfe.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
@JsonIgnoreProperties(ignoreUnknown=true)
public class Company {

    @Column( name = "company_name")
    private String name;
    public Company() {}

}
