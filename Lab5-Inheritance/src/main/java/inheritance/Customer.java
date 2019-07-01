package inheritance;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
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

Customer(String firstname,String lastname){
    this.firstname=firstname;
    this.lastname=lastname;
}
}
