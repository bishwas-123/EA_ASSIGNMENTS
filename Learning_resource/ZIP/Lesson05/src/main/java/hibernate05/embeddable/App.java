package hibernate05.embeddable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("cs544");


	private static void persistPerson(){
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Address address = new Address("1000 N 4th St", "Fairfield", "IA", "52556");
		Person person = new Person("Tina", "Xing", address);
		em.persist(person);

		em.getTransaction().commit();

		em.close();
	}

	private static void persistCustomer(){
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Address address1 = new Address("1000 N 4th St", "Fairfield", "IA", "52556");
		Address address2 = new Address("250 2nd St", "Fairfield", "IA", "52556");
		Customer customer = new Customer("Tina", "Xing", address1, address2);
		em.persist(customer);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	public static void main(String[] args) {
		persistPerson();
		persistCustomer();
	}

}
