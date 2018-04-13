package com.schoolcloudy.repository.staff;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.aspectj.runtime.internal.PerObjectMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.shared.entities.Credential;


@Repository
public class AdministratorRepositoryImpl implements AdministratorRepository{

	@PersistenceContext
	EntityManager em;

	@Autowired
	private AdministratorJpaRepository jpaAdministratorRepository;
	

	@Override
	public Administrator save(Administrator administrator) {
		if(administrator.getInternalId() == null) {
			return jpaAdministratorRepository.save(administrator);
		}else {
			return em.merge(administrator);
		}
	}
	
	@Override
	public List<Administrator> findAllAdministrator() throws DataAccessException {
		return jpaAdministratorRepository.findAll();
	}

	@Override
	public long countAdministrators() throws DataAccessException {
		return em.createQuery("SELECT COUNT(administrator) FROM Administrator administrator", Long.class).getSingleResult();
	}

	@Override
	public Administrator findOneByIds(long internalId, String externalId) throws DataAccessException {
		System.out.println(em.createQuery("SELECT c FROM Administrator admin JOIN "
				+ "admin.credential c WHERE c.username=:username", Credential.class)
				.setParameter("username", "sarah.mourine")
				.getSingleResult());
		return null;
	}
	
	

}
