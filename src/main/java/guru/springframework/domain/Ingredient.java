package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
//@EqualsAndHashCode(exclude = {"recipe"})
//@Entity
public class Ingredient {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;
    private BigDecimal amount;
    //@ManyToOne
    private Recipe recipe;
    //@OneToOne(fetch = FetchType.EAGER)
    @DBRef
    private UnitOfMeasure uom;

    public Ingredient(){

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }
}
