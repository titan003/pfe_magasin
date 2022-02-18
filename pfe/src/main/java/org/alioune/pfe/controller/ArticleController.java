package org.alioune.pfe.controller;

import org.alioune.pfe.domain.Article;
import org.alioune.pfe.service.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= "*") //"*"  signifie que toutes les origines sont autorisÃ©es
public class ArticleController {

    //a modifie avce ArticleService
    @Autowired
    MagasinService magasinService ;

    @GetMapping("/articles")
    public Iterable<Article> listart() {
        return magasinService.listart();
    }
    @GetMapping("/articleName")
    public List<String> listNameart(){
        return magasinService.findNameart();
    }
}
