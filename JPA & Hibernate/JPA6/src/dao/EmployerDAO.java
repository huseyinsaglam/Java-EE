package dao;

import java.util.List;

import mode01.Employer;

public interface EmployerDAO {
	

	public void insertEmployer(Employer employe);
	public Employer getEmployeeById(int id);
	public List<Employer> geEmployers();
	public void deleteEmployer(int id);
	public void guncellemesalary(int id , int maas);
	

}
