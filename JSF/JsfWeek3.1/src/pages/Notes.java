package pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean

public class Notes {
	
	private String name;
	private String passoword;
	
	
	public Notes() {
		super();
	}
	public Notes(String name, String passoword) {
		super();
		this.name = name;
		this.passoword = passoword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpassoword() {
		return passoword;
	}
	public void setpassoword(String passoword) {
		this.passoword = passoword;
	}
	

}
