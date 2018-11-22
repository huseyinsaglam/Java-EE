package mode01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String model;
	private String number;
	
	
	
	
	
	public Phone() {
		super();
	}
	public Phone(String model, String number) {
		super();
		this.model = model;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
	

}
