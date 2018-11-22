package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DeparmantDAO;
import dao.DepartmantDAOImpl;
import dao.EmployerDAO;
import dao.EmployerDAOImpl;
import dao.ProjectDAO;
import dao.ProjectDAOImpl;
import mode01.Depermant;
import mode01.Employer;
import mode01.Project;

public class JPAtest {

	public static void main(String[] args) {


		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployerDAO employerDAO=new EmployerDAOImpl(entityManager);
		DeparmantDAO deparmantDAO = new DepartmantDAOImpl(entityManager);
		
		Employer employer = new Employer("huseyin", "saglam", 5000);
		Employer employer1 = new Employer( "nevin", "saglam", 3500);
		Employer employer2 = new Employer( "merve", "saglam", 4000);
		
		employerDAO.insertEmployer(employer);
		employerDAO.insertEmployer(employer1);
		employerDAO.insertEmployer(employer2);
		
		
		Depermant depermant = new Depermant("sony");
		Depermant depermant2 = new Depermant("asus");
		Depermant depermant3= new Depermant("google");
		
		
	
		deparmantDAO.insertEmployer(depermant);
		deparmantDAO.insertEmployer(depermant2);
		deparmantDAO.insertEmployer(depermant3);
		
		
		EntityTransaction transaction = entityManager.getTransaction(); 
		transaction.begin();
		employer.setDepermant(depermant);
		employer1.setDepermant(depermant2);
		employer2.setDepermant(depermant2);
		transaction.commit();
		
		
		ProjectDAO projectDAO = new ProjectDAOImpl(entityManager);
		
		Project project1 = new Project("JAVAEE");
		Project project2 = new Project("ORACLE");
		Project project3 = new Project("CSS");
		Project project4 = new Project("JAVASE");
		Project project5 = new Project("HTML");
		Project project6 = new Project("JAVASCRÝPT");
		
		projectDAO.insertEmployer(project1);
		projectDAO.insertEmployer(project2);
		projectDAO.insertEmployer(project3);
		projectDAO.insertEmployer(project4);
		projectDAO.insertEmployer(project5);
		projectDAO.insertEmployer(project6);
		
		employerDAO.updateProject(employer, project1);
		employerDAO.updateProject(employer, project3);
		
		employerDAO.updateProject(employer1, project2);
		employerDAO.updateProject(employer1, project3);
		
		employerDAO.updateProject(employer2, project4);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
