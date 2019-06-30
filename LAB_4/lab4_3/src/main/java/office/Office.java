package office;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Office {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @OneToMany(mappedBy = "office")
    private List<Employee> employees=new ArrayList<Employee>();
    Office(String title){
        this.title=title;
    }
    void setEmployees(Employee employee){employees.add(employee);}

}
