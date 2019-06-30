package department;

import department.Employee;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Setter
//@Getter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employee> employees=new ArrayList<Employee>();

    public Department(String name){
        this.name=name;

    }
}
