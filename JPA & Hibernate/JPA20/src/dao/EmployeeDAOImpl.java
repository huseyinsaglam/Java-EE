package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Employee;
import model.EmployeeDetails;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private EntityManager entityManager;
	
	

	


	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}






	@Override
	public void insertEmployee(Employee employee) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	
	
		
	}




	public Employee getEmployeeById(int id) {
		Employee employee=entityManager.find(Employee.class,id); // ilgili kayýdý buluyor
		return employee;
	}






	@Override
	public List<Employee> findAllEmployess() {
	  TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e" , Employee.class);
	  return query.getResultList();
	}






	@Override
	public void deleteEmployee(int id) {
		
		Employee employee = getEmployeeById(id);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		 entityManager.remove(employee);
		transaction.commit();
		
	}






	@Override
	public void updateEmployee(int id, int raise) {
		
		Employee employee = getEmployeeById(id);
	   EntityTransaction transaction=	entityManager.getTransaction();
	   transaction.begin();
	    employee.setSalary(employee.getSalary()+raise);
	   transaction.commit();
		
	}






	@Override
	public List<String> getEmployee() {
		 TypedQuery<String> query = entityManager.createQuery("Select e.name from Employee e" , String.class);
		  return query.getResultList();
	}






	@Override
	public String Sorgulama(int id) {
		
		TypedQuery<String> query = entityManager.createQuery("Select e.name from Employee e where e.id=?1" , String.class)
				.setParameter(1, id);
		
		return query.getSingleResult();
		
	}
	
	@Override
	public List<Object[]> nameandsurnamesorgulama()
	{

		TypedQuery<Object[]> query = entityManager.createQuery("Select e.name,e.surname from Employee e " , Object[].class);
		return query.getResultList();
			
	}
	
	@Override
	public List<EmployeeDetails> nameandsurnameConstructorExpression()
	{

		TypedQuery<EmployeeDetails> query = entityManager
				.createQuery("Select New  model.EmployeeDetails(e .name,e.surname) from Employee e " , EmployeeDetails.class);
		return query.getResultList();
			
	}






	@Override
	public List<Employee> getEmployeeBetween(int salary1, int salary2) {
		
		TypedQuery< Employee> query = entityManager.createQuery("Select e from Employee e where e.salary BETWEEN ?1 and ?2", Employee.class)
		.setParameter(1, 2000)
		.setParameter(2, 4000);
		return query.getResultList();
	}






	@Override
	public List<Employee> getEmployeeLike() {
	 TypedQuery<Employee> query =entityManager.createQuery("Select e from Employee e where e.name LIKE 'hus%'",Employee.class);
	 return query.getResultList();
	 
	}






	@Override
	public List<Employee> getEmployeeIN() {
		TypedQuery< Employee> query = entityManager.createQuery("Select e from Employee e where e.name IN('huseyin','inayet')", Employee.class);
		return query.getResultList();
	}






	@Override
	public long getSUMEmployee() {
		TypedQuery< Long> query = entityManager.createQuery("Select SUM(e.salary) from Employee e",long.class);
		  return query.getSingleResult();	
		  
	}
	
	@Override
	public Integer getMAXEmployee() {
		TypedQuery< Integer> query = entityManager.createQuery("Select MAX(e.salary) from Employee e",Integer.class);
		  return query.getSingleResult();	
		  
	}
	
	@Override
	public long getCOUNTEmployee() {
		TypedQuery< Long> query = entityManager.createQuery("Select COUNT(e.id) from Employee e",Long.class);
		  return query.getSingleResult();	
		  
	}
	
	@Override
	public Double getAVGEmployee() {
		TypedQuery< Double> query = entityManager.createQuery("Select AVG(e.salary) from Employee e",Double.class);
		  return query.getSingleResult();	
		  
	}

	
	@Override
	public List<Integer> getORDERBYEmployee() {
		TypedQuery<Integer> query = entityManager.createQuery("Select e.salary from Employee e ORDER BY e.salary DESC",Integer.class);
		  return query.getResultList();
		  
	}
}
