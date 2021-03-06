package without_inheritance;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class OrderLine {
    @Id
    @GeneratedValue
    private Long id;
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    OrderLine(int quantity,Product product){
        this.quantity=quantity;
        this.product=product;
    }
}
