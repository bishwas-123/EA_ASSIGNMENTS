package hibernate05.secondarytable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("cs544");

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Product p = new Product("Speaker", 100, true);
		em.persist(p);


		em.getTransaction().commit();

		emf.close();

	}

}
