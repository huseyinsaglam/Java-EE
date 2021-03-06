package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DeparmantDAO;
import dao.DepartmantDAOImpl;
import dao.EmployerDAO;
import dao.EmployerDAOImpl;
import dao.PhoneDAO;
import dao.PhoneDAOImpl;
import mode01.Depermant;
import mode01.Employer;
import mode01.Nickname;
import mode01.Phone;

public class JPAtest {

	public static void main(String[] args) {


		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployerDAO employerDAO=new EmployerDAOImpl(entityManager);
		DeparmantDAO deparmantDAO = new DepartmantDAOImpl(entityManager);
		
		Employer employer = new Employer("huseyin", "saglam", 5000);
		Employer employer1 = new Employer( "nevin", "saglam", 3500);
		Employer employer2 = new Employer( "merve", "saglam", 4000);
		
		employerDAO.insertEmployer(employer);
		employerDAO.insertEmployer(employer1);
		employerDAO.insertEmployer(employer2);
		
		
		Depermant depermant = new Depermant("sony");
		Depermant depermant2 = new Depermant("asus");
		Depermant depermant3= new Depermant("google");
		
	
		deparmantDAO.insertEmployer(depermant);
		deparmantDAO.insertEmployer(depermant2);
		deparmantDAO.insertEmployer(depermant3);
		
		
		EntityTransaction transaction = entityManager.getTransaction(); // veri taban�nda gucelleme islemleri...
		transaction.begin();
		employer.setDepermant(depermant2);
		employer1.setDepermant(depermant2);
		employer2.setDepermant(depermant2);
		transaction.commit();
		
		
		PhoneDAO phoneDAO = new PhoneDAOImpl(entityManager);
		
		Phone phone1 = new Phone("HOME", "111111");
		Phone phone2 = new Phone("WORK", "222222");
		Phone phone3 = new Phone("MOB�LE", "333333");
		Phone phone4 = new Phone("HOME", "4444444");
		Phone phone5 = new Phone("MOB�LE", "5555555");
		
		phoneDAO.insertEmployer(phone1);
		phoneDAO.insertEmployer(phone2);
		phoneDAO.insertEmployer(phone3);
		phoneDAO.insertEmployer(phone4);
		phoneDAO.insertEmployer(phone5);
		
		employerDAO.updatePhone(employer, phone1);
		employerDAO.updatePhone(employer, phone2);
		
		employerDAO.updatePhone(employer1, phone3);
		employerDAO.updatePhone(employer1, phone4);
		
		employerDAO.updatePhone(employer2, phone5);
		
		
		Nickname nickname1 = new Nickname("hatayspor", "Hatay");
		Nickname nickname2 = new Nickname("fenerbahce", "spor_kulubu");
		
		employerDAO.updateNickname(employer1, nickname1);
		employerDAO.updateNickname(employer2, nickname2);
		
		
	String email1= "a@b.com";
	String email2= "c@d.com";
	String email3= "e@f.com";
	String email4= "g@h.com";
		
	employerDAO.updateEmails(employer, email1);
	employerDAO.updateEmails(employer1, email2);
	employerDAO.updateEmails(employer2, email3);
	employerDAO.updateEmails(employer1, email3);
	employerDAO.updateEmails(employer1, email4);
		
		
	}

}
