package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    private static EntityManagerFactory emf;

    public static List<Students> getAllStudents(EntityManager em){
        TypedQuery<Students> query = em.createQuery("from  edu.mum.cs544.Students",Students.class);
        List<Students> studentList = query.getResultList();
        return studentList;
    }
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("simpsons");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        // retieve all books
        List<Students> students= getAllStudents(em);
        for (Students student : students) {
            System.out.println("Sudent Name: "+student.getName());
        }
        em.getTransaction().commit();
        em.close();
        em=emf.createEntityManager();
        em.getTransaction().begin();
        // retieve all books
        Students student=new Students(13,"Jim","jim@gmail.com","1234?");
        em.persist(student);

        em.getTransaction().commit();
        em.close();

        em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Students> students1= getAllStudents(em);
        for (Students student1 : students) {
            System.out.println("Sudent Name: "+student1.getName());
        }
        em.getTransaction().commit();
        em.close();


    }
}
