package reservation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Time;
import java.time.LocalTime;

public class AppReservation {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        java.util.Date date=new java.util.Date();

        Time time= java.sql.Time.valueOf(LocalTime.now());
        Reservation reservation=new Reservation(date,time);
        em.persist(reservation);
        Book book=new Book(date,time,reservation);
        Book book1=new Book(date,time,reservation);
        em.persist(book);
        em.persist(book1);
        em.getTransaction().commit();
        em.close();

    }
}
