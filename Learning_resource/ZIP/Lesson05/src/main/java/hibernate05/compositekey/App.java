package hibernate05.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

public class App {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("cs544");


	private static void persistPerson(){
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee e = new Employee(new Name("Tina", "Xing"), new Date());
		em.persist(e);
		//Will fail no matter if equals&hashcode is override
//		Employee e2 = new Employee(new Name("Tina", "Xing"), new Date());
//		em.persist(e2);

		List<Employee> emps = em.createQuery("from Employee", Employee.class).getResultList();
		System.out.println(emps);
		em.getTransaction().commit();

		em.close();
	}


	public static void main(String[] args) {
		persistPerson();

	}

}
