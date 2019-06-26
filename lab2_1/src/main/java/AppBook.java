import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppBook {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        java.util.Date date=new java.util.Date();
        Book b1=new Book("java Progeamming", "1234", "Erich Gama",1200,date);
        em.persist(b1);

        Book b2=new Book("java Progeamming", "1234", "Erich Gama",1200,date);
        em.persist(b2);

        Book b3=new Book("java Progeamming", "1234", "Erich Gama",1200,date);
        em.persist(b3);
        em.getTransaction().commit();
        em.close();
    }


}
