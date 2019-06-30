package course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppCourse {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Course course=new Course("Java");
        Student student=new Student("Tony",12);

        course.setStudents(student);
        student.setCourses(course);
em.persist(course);
em.persist(student);
        em.getTransaction().commit();
        em.close();

    }

}
