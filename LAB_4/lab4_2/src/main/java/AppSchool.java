import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class AppSchool {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Student student1=new Student(11L,"Jim","Turner",12);
        Student student2=new Student(12L,"Harry","martin",14);

        Map<Long,Student> studentMap=new HashMap<>();
        studentMap.put(11L,student1);
        studentMap.put(12L,student2);
        School school=new School("Mum","hhhhh",studentMap);



        em.persist(school);

        em.getTransaction().commit();
        em.close();
    }
}
