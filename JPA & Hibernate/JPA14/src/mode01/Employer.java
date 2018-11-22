package mode01;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Depermant depermant;
	
	@OneToMany
	private List<Phone> phones;
	
	@Embedded
	private Nickname nickname;
	
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
	
	
	
	
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	
	
	public Nickname getNickname() {
		return nickname;
	}
	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}
	// to String Override ettik yazdýracagýmýz icin 
	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	
	

}
