package org.alioune.pfe.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Data
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String couleurs;
    private String tailles;
    private String prix;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_magasin", referencedColumnName= "id")
    private Magasin magasin;

    public Article() {}
}
