package test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployerDAO;
import dao.EmployerDAOImpl;
import mode01.EmloyerType;
import mode01.Employer;

public class JPAtest {

	public static void main(String[] args) {


		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployerDAO employerDAO=new EmployerDAOImpl(entityManager);
		
		Employer employer = new Employer( "huseyin", "saglam", 5000);
		Employer employer1 = new Employer( "nevin", "saglam", 3500);
		Employer employer2 = new Employer( "merve", "saglam", 4000);
		
		
		
		
		
		// Enunmareted Kýsmý
		employer.setEmloyerType(EmloyerType.FullTime);
		employer1.setEmloyerType(EmloyerType.ParkTime);
		employer2.setEmloyerType(EmloyerType.ConstractedTime);
		// *******************
	
		
		employerDAO.insertEmployer(employer);
		employerDAO.insertEmployer(employer1);
		employerDAO.insertEmployer(employer2);
	
	
		
	}

}
