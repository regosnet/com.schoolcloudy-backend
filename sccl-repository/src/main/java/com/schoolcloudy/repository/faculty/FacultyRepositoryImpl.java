package com.schoolcloudy.repository.faculty;
/*
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.schoolcloudy.model.shared.entities.Faculty;


@Repository
public class FacultyRepositoryImpl implements FacultyRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private JpaFaculty jpaFaculty;
	
	@Override
	public Faculty save(Faculty faculty) {
		if(faculty == null) {
			return jpaFaculty.save(faculty);
		}else {
			return em.merge(faculty);
		}
	}

	@Override
	public Faculty findAFaculty(Long id) throws DataAccessException{
		return em.createQuery("SELECT faculty FROM Faculty faculty WHERE faculty.internalId = :idFaculty", Faculty.class)
				.setParameter("idFaculty", id)
				.getSingleResult();
	}

	@Override
	public List<Faculty> findAll() throws DataAccessException {
		return jpaFaculty.findAll();
	}
}
*/