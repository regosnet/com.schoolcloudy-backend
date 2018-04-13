package com.schoolcloudy.repository.school;
/*
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.schoolcloudy.model.shared.entities.Faculty;
import com.schoolcloudy.model.shared.entities.School;


@Repository
public class SchoolRepositoryImpl implements SchoolRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	JpaSchool jpaSchool;
	
	@Override
	public List<School> getSchool() throws DataAccessException{
		return em.createQuery("SELECT school FROM "
				+ "School school", School.class).getResultList();
	}

	@Override
	public List<Faculty> getFaculties() throws DataAccessException{
		return em.createQuery("SELECT faculties FROM School school JOIN "
				+ "school.schoolFaculties faculties", Faculty.class)
				.getResultList();
	}

	@Override
	public School save(School school) throws DataAccessException{
		if(school.getInternalId() == null) {
			school.setExternalId(externalIdGenerator(school));
			return jpaSchool.save(school);
		}else {
			return em.merge(school);
		}
	}

	private String externalIdGenerator(School school) throws DataAccessException{
		String schoolExtIdFormat = "SUT0010";
		Long t = em.createQuery("SELECT COUNT(school) FROM School school", Long.class).getSingleResult();
		long f = t + 1L;
		return schoolExtIdFormat + f;
	}
}
*/