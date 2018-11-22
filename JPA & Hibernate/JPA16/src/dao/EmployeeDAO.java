package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	
	
	public void insertEmployee(Employee employee);
	
	public Employee findEmployee(int id);
	
	public void removeEmployee(int id);
	
	public List<Employee> findAllemployees();

}
