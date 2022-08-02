package guru.springframework.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Document
//@EqualsAndHashCode(exclude = {"recipes"})
//@Entity
public class Category {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;

    //@ManyToMany(mappedBy = "categories")
    @DBRef
    private Set<Recipe> recipes;

}
