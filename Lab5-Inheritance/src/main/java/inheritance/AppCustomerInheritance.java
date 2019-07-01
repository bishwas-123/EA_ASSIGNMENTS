package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppCustomerInheritance {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        Customer customer=new Customer("tony","martin");
        em.persist(customer);

        Product product =new Product("Noodles","this is good");


        OrderLine orderLine=new OrderLine(12,product);


        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        Order order=new Order(date,customer);
        order.setOrderLines(orderLine);
        em.persist(orderLine);
//        em.persist(product);
        em.persist(order);





        em.getTransaction().commit();
        em.close();

    }
}
