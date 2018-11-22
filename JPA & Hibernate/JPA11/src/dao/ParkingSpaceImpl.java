package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import mode01.Employer;
import mode01.ParkingSpace;

public class ParkingSpaceImpl implements ParkingSpaceDAO {
	
	
	private EntityManager entityManager;
	
	

	public ParkingSpaceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	public void insertEmployer(ParkingSpace parkingspace) {
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
		   entityManager.persist(parkingspace);
		transaction.commit();
		
	}




}
