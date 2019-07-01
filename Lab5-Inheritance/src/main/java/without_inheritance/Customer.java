package without_inheritance;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
@OneToMany(mappedBy = "customer")
    List<Order> orders=new ArrayList<>();

}
