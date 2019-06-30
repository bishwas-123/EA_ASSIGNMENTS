import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class School {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
    @MapKey(name="firstName")
    private Map<Long,Student> students=new HashMap<>();


    public School(String name,String address,Map<Long,Student> students){
        this.name=name;
        this.address=address;
        this.students=students;

    }



}
