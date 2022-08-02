package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {//Mongo
    Optional<Category> findByDescription(String description);
}
