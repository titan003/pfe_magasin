package org.alioune.pfe.manager;

import java.util.List;

import org.alioune.pfe.domain.Magasin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MagasinRepository extends CrudRepository<Magasin, Long>{
	
	@Query(value = "select name FROM Magasin ")
    List<String> findName();
}
