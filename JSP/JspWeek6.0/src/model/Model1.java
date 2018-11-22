package model;

public class Model1 {
	
	private int departmentId;
	private String departmentName;
	public Model1()
	{
		
	}
	
	public Model1(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
