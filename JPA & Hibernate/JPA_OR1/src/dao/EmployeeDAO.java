package dao;


import java.util.List;

import javax.persistence.EntityManager;

import model.Employee;

public interface EmployeeDAO {
	
	
	public void insertEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	
	public List<Employee> findAllEmployess();

	public void deleteEmployee(int id);
	
	public void updateEmployee(int id ,int raise);
	
	

}
