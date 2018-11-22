package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Employee;

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
		
		Employee employee1 = getEmployeeById(id);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		 entityManager.remove(employee1);
		transaction.commit();
		
	}






	@Override
	public void updateEmployee(int id, int raise) {
		
		Employee employee2 = getEmployeeById(id);
	   EntityTransaction transaction=	entityManager.getTransaction();
	   transaction.begin();
	    employee2.setSalary(employee2.getSalary()+raise);
	   transaction.commit();
		
	}

}
