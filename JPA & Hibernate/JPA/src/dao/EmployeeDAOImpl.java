package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private EntityManager entitymanager;


	  public EmployeeDAOImpl(EntityManager entitymanager) {
	
		this.entitymanager = entitymanager;
	} 

	@Override
	public void insertEmployee(Employee employe) {
		
		EntityTransaction transaction = entitymanager.getTransaction();
		transaction.begin();
		
		entitymanager.persist(employe);
		transaction.commit();
		
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
