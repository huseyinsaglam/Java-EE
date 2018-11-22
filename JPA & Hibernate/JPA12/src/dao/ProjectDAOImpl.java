package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import mode01.Project;

public class ProjectDAOImpl implements ProjectDAO{
	
	private EntityManager entityManager;
	

	public ProjectDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public void insertEmployer(Project project) {
		EntityTransaction transaction = entityManager.getTransaction(); // veri tabanýnda gucelleme islemleri...
		transaction.begin();
			entityManager.persist(project);
		transaction.commit();
		
	}

}
