package without_inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppCustomer {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();




        em.getTransaction().commit();
        em.close();

    }
}
