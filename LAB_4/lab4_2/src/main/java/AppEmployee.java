import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class AppEmployee {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
       emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        Laptop laptop=new Laptop("Dell","dell is good");
        Laptop laptop1=new Laptop("HP","HP is good");
        Laptop laptop2=new Laptop("Mac","mac is good");
Set<Laptop> laptops=new HashSet<Laptop>();
laptops.add(laptop);
laptops.add(laptop1);
laptops.add(laptop2);

      Employee employee=new Employee("Sanjay","Trital",laptops);
      em.persist(employee);
        em.getTransaction().commit();
        em.close();

    }

}
