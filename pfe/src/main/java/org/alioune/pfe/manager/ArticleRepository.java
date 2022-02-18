package org.alioune.pfe.manager;



import org.alioune.pfe.domain.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Query(value = "select name FROM Article ")
    List<String> findNameart();
}

