package reservation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

//@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    private Date reservation_date;
    private Time reservation_time;

    Reservation(Date reservation_date,Time reservation_time){
        this.reservation_date=reservation_date;
        this.reservation_time=reservation_time;
    }



}
