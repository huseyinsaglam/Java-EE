package dao;

import java.util.List;

import mode01.Depermant;
import mode01.Employer;
import mode01.Nickname;
import mode01.Phone;


public interface EmployerDAO {
	

	public void insertEmployer(Employer employe);
	public Employer getEmployeeById(int id);
	public void setDepermant(Employer employer, Depermant depermant );
	public void updatePhone( Employer employer, Phone phone);
	public void updateNickname( Employer employer, Nickname nickname);
	public void updateEmails( Employer employer, String email);
	
	

	
	

}
