package without_inheritance;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue
    private Long id;
    private int quantity;
    @OneToMany
    List<Product> products=new ArrayList<Product>();
}
