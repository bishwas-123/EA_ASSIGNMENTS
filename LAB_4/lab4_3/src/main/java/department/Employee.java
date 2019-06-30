package department;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
//@Setter
//@Getter

public class Employee {
    @Id
    @GeneratedValue
    @Column(name="emp_id")
    private Long id;
    private String name;
    private double salary;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department department;

    public Employee(String name, double salary, Department department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
}
