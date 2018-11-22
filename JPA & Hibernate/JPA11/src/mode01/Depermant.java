package mode01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Depermant {
	 @Id
	 
	 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	
	private int id;
	private String name;
	
	
	
	public Depermant() {
		super();
	}
	
	public Depermant( String name) {
		super();
		
		this.name = name;
	}
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Depermant [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
