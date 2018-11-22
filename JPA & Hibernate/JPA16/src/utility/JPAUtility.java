package utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		JPAUtility.entityManagerFactory = entityManagerFactory;
	}

	
}
