package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
            this.description = uom;

    }
}
