package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import mode01.Phone;

public class PhoneDAOImpl implements PhoneDAO{
	
	private EntityManager entityManager;

	
	

	




	public PhoneDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}









	@Override
	public void insertEmployer(Phone phone) {
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
			entityManager.persist(phone);
		transaction.commit();
		
	}

}
