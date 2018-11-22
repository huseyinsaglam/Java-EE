package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeJPATest {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
	
		
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
		
		Employee employer = new Employee(15, "huseyin", "saglam", 5500);
		employeeDAO.insertEmployee(employer);
		
		
		
		
	}

}
