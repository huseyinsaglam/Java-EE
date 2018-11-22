package personBean;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class HelloJsf {
	
	private String name;
	private String passoword;
	
	
	public HelloJsf() {
		super();
	}
	public HelloJsf(String name, String passoword) {
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
	public String getPassoword() {
		return passoword;
	}
	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

}
