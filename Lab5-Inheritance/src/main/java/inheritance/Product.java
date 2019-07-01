package inheritance;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="product_name")
    private String name;
    private String description;

    Product(String name, String description){
        this.name=name;
        this.description=description;
    }
}
