package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployerDAO;
import dao.EmployerDAOImpl;
import mode01.Employer;

public class JPAtest {

	public static void main(String[] args) {


		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployerDAO employerDAO=new EmployerDAOImpl(entityManager);
		
		Employer employer = new Employer(1, "huseyin", "saglam", 5000);
		Employer employer1 = new Employer(2, "nevin", "saglam", 3500);
		Employer employer2 = new Employer(3, "merve", "saglam", 4000);
		
		employerDAO.insertEmployer(employer);
		employerDAO.insertEmployer(employer1);
		employerDAO.insertEmployer(employer2);
	
		
	
		
	}

}
