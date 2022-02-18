package org.alioune.pfe.domain;



import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
@JsonIgnoreProperties(ignoreUnknown=true)
public class Geo {

    private String lat;
    private String lng;

    public Geo() {}
    
}