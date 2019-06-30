package office;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppOffice {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Office office=new Office("Marketing");
      Employee employee=new Employee("Hary",office);
      Employee employee1=new Employee("Martin",office);

      office.setEmployees(employee);
      office.setEmployees(employee1);

      em.persist(office);
      em.persist(employee);
      em.persist(employee1);

        em.getTransaction().commit();
        em.close();

    }
}
