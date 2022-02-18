package org.alioune.pfe.controller;

import org.alioune.pfe.domain.Magasin;
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
public class MagasinController {

    @Autowired
    MagasinService magasinService;

    @GetMapping("/magasins")
    public Iterable<Magasin> list() {
        return magasinService.list();
    }
    @GetMapping("/magasinName")
    public List<String> listName(){
        return magasinService.findName();
    }


}
