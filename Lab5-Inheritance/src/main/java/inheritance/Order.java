package inheritance;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
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

    Order(Date date, Customer customer){
        this.date=date;
        this.customer=customer;
    }
    void setOrderLines(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
}
