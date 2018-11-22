package model;

public class Model2 {


	private int empId;
	private String name;
	private Model1 department;
	
	public Model2()
	{
		
	}
	public Model2(int empId, String name, Model1 department) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
	
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Model1 getDepartment() {
		return department;
	}
	public void setDepartment(Model1 department) {
		this.department = department;
	}
	
}
