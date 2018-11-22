package mode01;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Employer {
	@Id
	
	
	 @GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;
	private String surname;
	private int salary;
	
	
	@ManyToOne // yazsakda olur yazmazsakda olur...
	private Depermant depermant;
	
@ManyToMany
@JoinTable(name="EMP_PROJE" , joinColumns=@JoinColumn(name="EMP_ÝD") , inverseJoinColumns=@JoinColumn(name="PROJE_ÝD")

		)
	private List<Project> projects;
	
	
	public Employer(Depermant depermant) {
		super();
		this.depermant = depermant;
	}
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
	
	
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	// to String Override ettik yazdýracagýmýz icin 
	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", depermant="
				+ depermant + "]";
	}
	
	
	

}
