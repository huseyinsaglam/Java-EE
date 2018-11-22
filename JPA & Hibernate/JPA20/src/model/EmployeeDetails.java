package model;

public class EmployeeDetails {
	
	private String name;
	private String surname;
	
	
	
	
	
	public EmployeeDetails() {
		super();
	}
	public EmployeeDetails(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
