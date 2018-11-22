package dao;

import java.util.List;

import mode01.Depermant;
import mode01.Employer;
import mode01.Phone;


public interface EmployerDAO {
	

	public void insertEmployer(Employer employe);
	public Employer getEmployeeById(int id);
	public void setDepermant(Employer employer, Depermant depermant );
	public void updatePhone( Employer employer, Phone phone);
	

	
	

}
