package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;
import model.EmployeeDetails;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
		Employee employee1 = new Employee("sony", "asus", 2500);
		Employee employee2 = new Employee("ericson", "telekom", 3500);
		Employee employee3 = new Employee("huseyin", "saglam", 4500);
		Employee employee4 = new Employee("inayet", "saglam", 25000);
		Employee employee5 = new Employee("huseyin", "yýlmaz", 5500);
		Employee employee6 = new Employee("huseyin", "fenerbahçe", 6500);
		Employee employee7 = new Employee("inayet", "bahçe", 70500);
		Employee employee8 = new Employee("inayet", "muhendis", 48500);
		employeeDAO.insertEmployee(employee1);
		employeeDAO.insertEmployee(employee2);
		employeeDAO.insertEmployee(employee3);
		employeeDAO.insertEmployee(employee4);
		employeeDAO.insertEmployee(employee5);
		employeeDAO.insertEmployee(employee6);
		employeeDAO.insertEmployee(employee7);
		employeeDAO.insertEmployee(employee8);
		
		
		Employee employerfound = employeeDAO.getEmployeeById(3);
		System.out.println(employerfound);
		
		
		List<Employee> employees = employeeDAO.findAllEmployess();
		
		for(Employee e : employees)
		{
			System.out.println(e);
		}
		
		System.out.println("SADECE ÝSÝMLER");
		

List<String> employeess = employeeDAO. getEmployee();
		
		for(String em : employeess)
		{
			System.out.println(em);
		}
		
		System.out.println("******SORGULAMA***********");

		String sorgulama = employeeDAO.Sorgulama(2);
		
		System.out.println(sorgulama);
		
		
			
		System.out.println("******NAME AND SURNAME SORGULAMA***********");
		
		 List<Object[]> list = employeeDAO.nameandsurnamesorgulama();
		 
		 for(Object[] i : list)
		 {
			 System.out.println("name = "+ i[0] + " - " + "surname ="  + i[1] );
		 }
			
			
		 System.out.println("******NAME AND SURNAME CONSRUCTOREXPRESSÝON***********");
			
		 List<EmployeeDetails> details = employeeDAO.nameandsurnameConstructorExpression();
		 
		 
		 for(EmployeeDetails h : details)
		 {
			 System.out.println(details);
		 }
		 
		 List<Employee> emp= employeeDAO.getEmployeeBetween(2000,4000);
		 
		 System.out.println("******BETWEEN*******");
		 for(Employee k : emp) // to string sayesinde yazdýyoruz...
		 {
			 System.out.println(emp);
		 }
		 
		 
		 List<Employee> emp2 = employeeDAO.getEmployeeLike();
		 
		 System.out.println("*****LÝKE********");
		 
		 for(Employee l : emp2)
		 {
			 System.out.println(emp2);
		 }
		 
		 
		 List<Employee> emp3 = employeeDAO.getEmployeeIN();
		 
		 System.out.println("******IN******");
		
			emp3.forEach(System.out::println);
			
			System.out.println("TOPLAM ÖDENEN MAAÞLAR");
		Long emp4=	employeeDAO.getSUMEmployee();
		System.out.println(emp4);
		
		

		System.out.println("MAX MAAÞI");
	Integer emp5=	employeeDAO.getMAXEmployee();
	System.out.println(emp5);
	
	
	

	System.out.println("***COUNT*****");
Long emp6=	employeeDAO.getCOUNTEmployee();
System.out.println(emp6);


System.out.println("***AVG*****");
Double emp7=	employeeDAO.getAVGEmployee();
System.out.println(emp7);


System.out.println("***ORDER BY*****");
List<Integer>  emp8=	employeeDAO.getORDERBYEmployee();
System.out.println(emp8);
	
	
	
	
	
	}
	



	
	
	

	      
}
	
	
	

