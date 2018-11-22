package mode01;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="EmployerAUTOTable2") // Tablo ismini degisterebiliyoruz buradan...
public class Employer {
	@Id
	
	
	// @GeneratedValue(strategy= GenerationType.AUTO)
	// @GeneratedValue(strategy= GenerationType.TABLE)
	
	@TableGenerator(name="EMP_GEN")
	@GeneratedValue(generator=" EMP_GEN")
	
	@Column(name="new_id") // kolon ismini bu sekilde degistirebiliriz...
	private int id;
	
	@Column(name = "new_name") // kolon ismini bu sekilde degistirebiliriz...
	private String name;
	private String surname;
	private int salary;

	
   @Enumerated(EnumType.STRING) // Enum genelde order(sayi) tipindedir... Ama String'e  bu sekilde donusturebiliriz...
	private EmloyerType emloyerType;
	

	public Employer() {
		super();
	}
	
//	public Employer(int id, String name, String surname, int salary) {
//		super();
//		this.id = id;
//		this.name = name;
 //   	this.surname = surname;
//		this.salary = salary;
//	}
	
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
	
	
	
	public EmloyerType getEmloyerType() {
		return emloyerType;
	}
	public void setEmloyerType(EmloyerType emloyerType) {
		this.emloyerType = emloyerType;
	}
	
	
	
	
	// to String Override ettik yazdýracagýmýz icin 
	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary
				+ ", emloyerType=" + emloyerType + "]";
	}
	
	
	
	
	
	

}
