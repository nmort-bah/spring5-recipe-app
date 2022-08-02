package guru.springframework.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@Document
//@Entity
public class UnitOfMeasure {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;

  /*  public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
            this.description = uom;

    }

   */
}
