package org.alioune.pfe.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Magasin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Access(AccessType.PROPERTY)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;


    @Embedded
    private Address address;
    @Embedded
    private Company company;
 /*   @OneToMany(mappedBy = "magasin", cascade = CascadeType.ALL)
    private Set<Article> articles = new HashSet<>();
    
    public void set(Set<Article> articles) {
        this.articles = articles;

        for(Article article : articles) {
            article.setMagasin(this);
        }
    }  */
   
    public Magasin() {}



    
}