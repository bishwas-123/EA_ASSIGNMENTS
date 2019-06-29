import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="passenger_id")
    private List<Flight> flightList=new ArrayList<Flight>();


    public Passenger(String firstName, String lastName,List<Flight> flightList){
        this.firstName=firstName;
        this.lastName=lastName;
        this.flightList=flightList;
    }

}
