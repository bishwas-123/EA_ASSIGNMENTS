package without_inheritance;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="Order_table")
public class Order {
    @Id
    @GeneratedValue
    @Column(name="orderId")
    private Long id;
    @Column(name="order_date")
    private Date date;
    @ManyToOne
    private Customer customer;
    @OneToMany
    private List<OrderLine> orderLines=new ArrayList<OrderLine>();
}
