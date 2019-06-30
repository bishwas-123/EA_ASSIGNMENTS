package office;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="office_id")
    private Office office;

Employee(String name,Office office){
    this.name=name;
    this.office=office;
}
}
