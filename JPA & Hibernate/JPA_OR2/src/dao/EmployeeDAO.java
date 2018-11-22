package dao;


import java.util.List;

import model.Employee;
import model.EmployeeDetails;

public interface EmployeeDAO {
	
	
	public void insertEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	
	public List<Employee> findAllEmployess();

	public void deleteEmployee(int id);
	
	public void updateEmployee(int id ,int raise);
	
	public List<String> getEmployee();
	
	public String Sorgulama(int id);
	
	public List<Object[]> nameandsurnamesorgulama();
	public List<EmployeeDetails> nameandsurnameConstructorExpression();
	
	
	public List<Employee> getEmployeeBetween(int salary1,int salary2);
	
	public List<Employee> getEmployeeLike();
	public List<Employee> getEmployeeIN();
	
	public long getSUMEmployee();
	public Integer getMAXEmployee();
	
	public long getCOUNTEmployee();
	
	public Double getAVGEmployee() ;
	
	public List<Integer>  getORDERBYEmployee();
	
	
	

}
