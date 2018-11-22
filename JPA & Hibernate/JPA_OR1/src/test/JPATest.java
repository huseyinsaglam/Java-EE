package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
		Employee employee1 = new Employee("sony", "asus", 2500);
		Employee employee2 = new Employee("ericson", "telekom", 3500);
		Employee employee3 = new Employee("huseyin", "saglam", 4500);
		Employee employee4 = new Employee("inayet", "saglam", 25000);
		employeeDAO.insertEmployee(employee1);
		employeeDAO.insertEmployee(employee2);
		employeeDAO.insertEmployee(employee3);
		employeeDAO.insertEmployee(employee4);
		
		
		Employee employerfound = employeeDAO.getEmployeeById(3);
		System.out.println(employerfound);
		
		
		List<Employee> employees = employeeDAO.findAllEmployess();
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
		
		
		System.out.println("*********** DELETE SONRASI *******");
		
		employeeDAO.deleteEmployee(1);
		employeeDAO.deleteEmployee(2);
		
		 employees = employeeDAO.findAllEmployess();
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
		
		System.out.println("UPDATE ");
		
		employeeDAO.updateEmployee(3, 2000);
		
		 employees = employeeDAO.findAllEmployess();
			
			for(Employee e : employees)
			{
				System.out.println(e);
			}
			
			
			
			
			
			
			
			
			
	}
	
	
	
}
