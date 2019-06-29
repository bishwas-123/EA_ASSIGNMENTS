import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Setter
//@Getter
//@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
@OneToMany(cascade = CascadeType.ALL)
@OrderColumn
@JoinColumn(name="employee_id")

    private Set<Laptop> laptops=new HashSet<Laptop>();

Employee(String firstName, String lastName,Set<Laptop> laptops){
    this.firstName=firstName;
    this.lastName=lastName;
    this.laptops=laptops;
}

}
