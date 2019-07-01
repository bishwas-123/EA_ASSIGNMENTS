package without_inheritance;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="product_name")
    private String name;
    private String description;
}
