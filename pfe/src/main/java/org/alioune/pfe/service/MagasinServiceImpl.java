package org.alioune.pfe.service;


import org.alioune.pfe.domain.Article;
import org.alioune.pfe.domain.Magasin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.alioune.pfe.manager.MagasinRepository;
import org.alioune.pfe.manager.ArticleRepository;

import java.util.List;
import java.util.Optional;
@Service
public class MagasinServiceImpl implements MagasinService {

    @Autowired
     MagasinRepository magasinRepository;
    @Autowired
     ArticleRepository articleRepository;

    @Override
    public Iterable<Magasin> list() {
        return magasinRepository.findAll();
    }
    @Override
    public Iterable<Article> listart() {
        return articleRepository.findAll();
    }
    @Override
    public void save(List<Magasin> mag) {
        magasinRepository.saveAll(mag);
    }
    @Override
    public void saveart(List<Article> articles){
		System.out.println(articles);
    	for(Article article: articles) {
    		Optional<Magasin> optionalLibrary = magasinRepository.findById(article.getMagasin().getId());
    		article.setMagasin(optionalLibrary.get());
    	}
        articleRepository.saveAll(articles);
    }
    @Override
    public List<String> findName(){
        return magasinRepository.findName();
    }
    @Override
    public List<String> findNameart(){
        return articleRepository.findNameart();
    }

}