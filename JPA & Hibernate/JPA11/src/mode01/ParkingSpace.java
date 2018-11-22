package mode01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingSpace {
	
	@Id
	
	@GeneratedValue(strategy= GenerationType.TABLE)
	private int id;
	private String location;
	private int flat;
	
	
	
	
	public ParkingSpace() {
		super();
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public int getFlat() {
		return flat;
	}




	public void setFlat(int flat) {
		this.flat = flat;
	}




	public ParkingSpace(String location, int flat) {
		super();
		this.location = location;
		this.flat = flat;
	}
	
	

}
