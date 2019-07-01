package hibernate05.compositekey;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@ToString
@Entity
public class Employee {
    @EmbeddedId
    private Name name;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @OneToMany(mappedBy = "owner")
    private List<Project> projects = new ArrayList<>();


    public Employee() {
    }

    public Employee(Name name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }
}
