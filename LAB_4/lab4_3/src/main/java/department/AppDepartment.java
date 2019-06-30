package department;

import department.Department;
import department.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppDepartment {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
       emf= Persistence.createEntityManagerFactory("ea-db");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Department department=new Department("Sales");
        em.persist(department);

        Employee employee=new Employee("Tony",12000,department);
        Employee employee1=new Employee("John",13000,department);
        em.persist(employee);
        em.persist(employee1);


        em.getTransaction().commit();
        em.close();

    }

}
