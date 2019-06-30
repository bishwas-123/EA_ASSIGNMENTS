package edu.mum.main;
import edu.mum.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main1 {
    private static EntityManagerFactory emf;


    public static void getAllRecords(EntityManager em){
        TypedQuery<User> query = em.createQuery("from  edu.mum.domain.User",User.class);
        List<User> userList = query.getResultList();
        for(User u: userList){
            System.out.println("Name: "+ u.getFirstName()+" "+u.getLastName());
        }
    }

    public static User getOneUser(EntityManager em){
        TypedQuery<User> query = em.createQuery("from  edu.mum.domain.User",User.class);
        List<User> userList = query.getResultList();
          return userList.get(0);
    }


    public static void main(String[] args) {
        emf= Persistence.createEntityManagerFactory("simpsons");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        java.util.Date date=new java.util.Date();
        User user=new User("Jim","Turner","jim@gmail.com",true,date);
        em.persist(user);
        em.detach(user);//detaching
        user.setFirstName("James");// it does not work
        em.merge(user);
        System.out.println("************  this does not work ********************");
        getAllRecords(em);
        em.getTransaction().commit();
        em.close();
       em=emf.createEntityManager();
        em.getTransaction().begin();
        java.util.Date date1=new java.util.Date();
        User user1=new User("Jim","Turner","jim@gmail.com",true,date);
        em.persist(user1);
        user1=em.merge(user1);
        user1.setFirstName("james");// it will work
        System.out.println("************************ This will work *****************************");
         getAllRecords(em);
        em.getTransaction().commit();
        em.close();

        em=emf.createEntityManager();
        em.getTransaction().begin();
        User getUser=getOneUser(em);
        em.remove(getUser);
        System.out.println(  em.contains(getUser)+"    this shows result true because it is not removed from the persistance **********");
        em.flush();
        System.out.println(  em.contains(getUser)+"    this shows result false because it is not removed from the persistance **********");
       em.getTransaction().commit();

    }
}
