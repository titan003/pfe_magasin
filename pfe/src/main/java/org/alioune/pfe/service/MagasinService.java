package org.alioune.pfe.service;

import java.util.List;

import org.alioune.pfe.domain.Article;
import org.alioune.pfe.domain.Magasin;

public interface MagasinService {

     Iterable<Magasin> list();
     Iterable<Article> listart();
     void save(List<Magasin> mag);
     void saveart(List<Article> art);
     List<String> findName();
     List<String> findNameart();

}
