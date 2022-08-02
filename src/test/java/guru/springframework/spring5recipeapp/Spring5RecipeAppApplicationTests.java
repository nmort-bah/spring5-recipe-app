package guru.springframework.spring5recipeapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


//@SpringBootTest
@EnableMongoRepositories(basePackages = "com.example.portsandadapters.adapter.out.persistence.mongo")
class Spring5RecipeAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
