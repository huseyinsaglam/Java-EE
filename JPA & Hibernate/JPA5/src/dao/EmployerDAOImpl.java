package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import mode01.Employer;

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

	@Override
	public List<Employer> geEmployers() {
		//  Select * from Employer
		// Query query =entityManager.createQuery("Select emp from Employer emp");
		TypedQuery<Employer> query = entityManager.createQuery("Select emp from Employer emp",Employer.class);
		return query.getResultList();
	}

	@Override
	public void deleteEmployer(int id) {
	Employer employerr=getEmployeeById(id); // ilgili kaydý bulan metodu yukarýda yazdýk bu metodu cagýrdýk...
	EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
	transaction.begin();
		entityManager.remove(employerr);
	transaction.commit();
		
	}

	@Override
	public void guncellemesalary(int id, int maas) {
		Employer employerr=getEmployeeById(id); // ilgili kaydý bulan metodu yukarýda yazdýk bu metodu cagýrdýk...
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
		   employerr.setSalary(employerr.getSalary()+ maas);
	    transaction.commit();
		
		
	}
	
	

}
