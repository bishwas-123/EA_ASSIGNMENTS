import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

//@Entity
public class Flight {
    @Id
    @GeneratedValue
    private Long id;
    private String flightName;
    private Date flightDate;
    private Time flightTime;

    public Flight(String flightName, Date flightDate, Time flightTime){
        this.flightName=flightName;
        this.flightDate=flightDate;
        this.flightTime=flightTime;
    }
}
