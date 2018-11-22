package mode01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Employer {
	@Id
	
	
	 @GeneratedValue(strategy = GenerationType.TABLE)

	private int id;
	private String name;
	private String surname;
	private int salary;
	
	
	@ManyToOne
	@JoinColumn(name= "emp_dept_id")
	private Depermant depermant;
	
	
	
	public Employer() {
		super();
	}
	public Employer(String name, String surname, int salary) {
		super();
	
		this.name = name;
		this.surname = surname;
		this.salary = salary;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	public Depermant getDepermant() {
		return depermant;
	}
	public void setDepermant(Depermant depermant) {
		this.depermant = depermant;
	}
	// to String Override ettik yazdýracagýmýz icin 
	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	
	

}
