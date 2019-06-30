import lombok.ToString;

import javax.persistence.*;


//@ToString
//@Entity
public class Laptop {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name="employee_id",insertable = false,updatable = false)
    private Employee employee;

public Laptop(String name, String description){
    this.name=name;
    this.description=description;
}
}
