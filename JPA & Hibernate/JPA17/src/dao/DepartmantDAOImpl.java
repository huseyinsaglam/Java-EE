package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import mode01.Depermant;
import mode01.Employer;

public  class DepartmantDAOImpl implements DeparmantDAO {
	
	private EntityManager entityManager;
	


	public DepartmantDAOImpl(EntityManager entityManager) {
	
		this.entityManager = entityManager;
	}

	public void insertEmployer(Depermant depermant) {
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
			entityManager.persist(depermant);
		transaction.commit();
		
	}

	@Override
	public Depermant getDepertmantById(int id) {
		Depermant depermant=entityManager.find(Depermant.class,id); // ilgili kayýdý buluyor
		return  depermant;
	}


	
	
}
