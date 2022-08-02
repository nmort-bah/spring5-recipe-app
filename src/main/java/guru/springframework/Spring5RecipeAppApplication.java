package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication//(exclude = MongoAutoConfiguration.class)
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5RecipeAppApplication.class, args);
	}

}
