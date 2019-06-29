import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private int rollNo;
    @ManyToOne
    private School school;

    public Student(String firstName,String lastName,int rollNo){
        this.firstName=firstName;
        this.lastName=lastName;
        this.rollNo=rollNo;
    }

}
