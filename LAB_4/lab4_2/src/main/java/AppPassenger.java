import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AppPassenger {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Flight> flightList=new ArrayList<Flight>();
        java.util.Date date=new java.util.Date();

        Time time= java.sql.Time.valueOf(LocalTime.now());

        flightList.add(new Flight("American Airlines",date,time));
        flightList.add(new Flight("Dragon Airlines",date,time));

        Passenger passenger=new Passenger("John","Martin",flightList);
        em.persist(passenger);

        em.getTransaction().commit();
        em.close();
    }



}
