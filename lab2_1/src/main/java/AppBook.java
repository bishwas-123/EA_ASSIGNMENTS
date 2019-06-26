import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AppBook {
    private static EntityManagerFactory emf;

public static List<Book> getAllBooks(EntityManager em){
    TypedQuery<Book> query = em.createQuery("from Book", Book.class);
    List<Book> bookList = query.getResultList();
    return bookList;
}

    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        java.util.Date date=new java.util.Date();
        Book b1=new Book("java Progeamming1", "1234", "Erich Gama",1200,date);
        em.persist(b1);

        Book b2=new Book("java Progeamming2", "12345", "Erich Gama1",1300,date);
        em.persist(b2);

        Book b3=new Book("java Progeamming3", "12346", "Erich Gama2",1400,date);
        em.persist(b3);
        em.getTransaction().commit();
        em.close();



        em=emf.createEntityManager();
        em.getTransaction().begin();

        // retieve all books
//        TypedQuery<Book> query = em.createQuery("from Book", Book.class);
//        List<Book> bookList = query.getResultList();
       List<Book> bookList= getAllBooks(em);
        for (Book book : bookList) {
            System.out.println("Title="+ book.getTitle()+", ISBN="+book.getISBN()+", Author"+book.getAuthor()+
                    ", Price="+book.getPrice());
        }
        em.getTransaction().commit();
        em.close();



        em=emf.createEntityManager();
        em.getTransaction().begin();
        //retirieve all books
//        TypedQuery<Book> query1 = em.createQuery("from Book", Book.class);
//       List<Book> bookList1 = query1.getResultList();
        List<Book> bookList1=getAllBooks(em);
        bookList1.get(0).setPrice(1800);
        bookList1.get(0).setTitle("C programming");

        em.remove(bookList1.get(1));
        em.getTransaction().commit();
        em.close();

        em=emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Book> query2 = em.createQuery("from Book", Book.class);
        List<Book> bookList2 = query2.getResultList();
        for (Book book2 : bookList2) {
            System.out.println("Title="+ book2.getTitle()+", ISBN="+book2.getISBN()+", Author"+book2.getAuthor()+
                    ", Price="+book2.getPrice());
        }
        em.getTransaction().commit();
        em.close();



    }


}
