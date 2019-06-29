package edu.mum.cs544;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AppCar {
	private static EntityManagerFactory emf;
    public static void main(String[] args) throws Exception {

        emf = Persistence.createEntityManagerFactory("ea-db");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        java.util.Date date=new java.util.Date();
        Owner owner=new Owner("Bishwas","1000 North 4th Street");
                em.persist(owner);
        Car car1 = new Car("BMW", date, 30221.00,owner);
       em.persist(car1);
     Car car2 = new Car("Mercedes", date, 4088.00,owner);
      em.persist(car2);
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        // retieve all cars
        TypedQuery<Car> query = em.createQuery("from Car", Car.class);
        List<Car> carList = query.getResultList();
        System.out.println(carList);
//        for (Car car : carList) {
//            System.out.println("brand= " + car.getBrand() + ", year= "
//                    + car.getYear() + ", price= " + car.getPrice());
//        }
        em.getTransaction().commit();
        em.close();
    }
}

