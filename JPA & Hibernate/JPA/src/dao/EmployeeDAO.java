package dao;

import model.Employee;

public interface EmployeeDAO {

	public void insertEmployee(Employee employe);
	public Employee getEmployeeById(int id);
}
