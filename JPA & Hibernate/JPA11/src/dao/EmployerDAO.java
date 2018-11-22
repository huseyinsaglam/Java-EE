package dao;

import java.util.List;

import mode01.Depermant;
import mode01.Employer;
import mode01.ParkingSpace;

public interface EmployerDAO {
	

	public void insertEmployer(Employer employe);
	public Employer getEmployeeById(int id);
	public void updateSpace(Employer employer, ParkingSpace parkingSpace );
	

	
	

}
