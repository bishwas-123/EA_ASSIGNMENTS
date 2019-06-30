package reservation;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

//@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private Date booking_date;
    private Time booking_time;
    @ManyToOne
    @JoinColumn(name="reservation_id")
    private Reservation reservation;

    Book(Date booking_date, Time booking_time,Reservation reservation){
        this.booking_date=booking_date;
        this.booking_time=booking_time;
        this.reservation=reservation;
    }



}
