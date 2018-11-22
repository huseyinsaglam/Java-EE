package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import mode01.Depermant;
import mode01.Employer;
import mode01.Phone;


public class EmployerDAOImpl implements EmployerDAO {
	
	private EntityManager entityManager;
	

	public EmployerDAOImpl(EntityManager entitymanager) {
		
		this.entityManager = entitymanager;
	}

	@Override
	public void insertEmployer(Employer employe) {
		
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
	transaction.begin();
		entityManager.persist(employe);
	transaction.commit();
	}

	@Override
	public Employer getEmployeeById(int id) {
		
		Employer employer=entityManager.find(Employer.class,id); // ilgili kayýdý buluyor
		return employer;
	}

	public void setDepermant(Employer employer, Depermant depermant) {
	
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
		employer.setDepermant(depermant);
		transaction.commit();
		
	}

	

	@Override
	public void updatePhone(Employer employer, Phone phone) {
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
		employer.getPhones().add(phone);
		transaction.commit();
		
		
	}

	

	
	

}
