package org.alioune.pfe.service;

import java.util.List;

import org.alioune.pfe.domain.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleService extends CrudRepository<Article, Long>{
	 @Query(value = "select name FROM Article ")
	    List<String> findNameart();
}
