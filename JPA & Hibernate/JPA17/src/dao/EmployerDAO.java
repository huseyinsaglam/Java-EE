package dao;

import java.util.List;

import mode01.Depermant;
import mode01.Employer;

public interface EmployerDAO {
	

	public void insertEmployer(Employer employe);
	public Employer getEmployeeById(int id);
	public void setDepermant(Employer employer, Depermant depermant );
	

	
	

}
