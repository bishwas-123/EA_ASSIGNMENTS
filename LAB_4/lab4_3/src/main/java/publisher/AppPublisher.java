package publisher;

import publisher.Book;
import publisher.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppPublisher {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        Publisher publisher=new Publisher("American Authors");
        em.persist(publisher);

        Book book =new Book("Java",publisher);
        Book book1=new Book("C++",publisher);
        em.persist(book);
        em.persist(book1);




        em.getTransaction().commit();
        em.close();

    }
}
