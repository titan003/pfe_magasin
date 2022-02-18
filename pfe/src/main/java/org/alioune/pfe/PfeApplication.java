package org.alioune.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.alioune.pfe.domain.Article;
import org.alioune.pfe.domain.Magasin;
import org.alioune.pfe.service.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
public class PfeApplication implements CommandLineRunner {
	
	@Autowired
	MagasinService magasinService;

	public static void main(String[] args) {
		SpringApplication.run(PfeApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception{

			// read JSON and load json magasin
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Magasin>> typeReference = new TypeReference<List<Magasin>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/magasins.json");
			try {
				List<Magasin> magasins = mapper.readValue(inputStream,typeReference);
				magasinService.save(magasins);
				System.out.println("Magasins Saved!");

			} catch (IOException e){
				System.out.println("Unable to save Magasin: " + e.getMessage());
			}
			// read JSON and load json article
			ObjectMapper mapper2 = new ObjectMapper();
			TypeReference<List<Article>> typeReference2 = new TypeReference<List<Article>>(){};
			InputStream inputStream2 = TypeReference.class.getResourceAsStream("/json/articles.json");
			try {
				List<Article> articles = mapper2.readValue(inputStream2,typeReference2);
				magasinService.saveart(articles);
				System.out.println("Articles Saved!");

			} catch (IOException e){
				System.out.println("Unable to save Article: " + e.getMessage());
			}


	    };

}


