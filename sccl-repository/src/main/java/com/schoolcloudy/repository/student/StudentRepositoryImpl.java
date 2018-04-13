package com.schoolcloudy.repository.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.schoolcloudy.model.entities.Student;


@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	@Autowired
	private StudentJpaRepository studentJpaRepository;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Student save(Student student) throws DataAccessException {
		if(student.getInternalId() == null) {
			return studentJpaRepository.save(student);
		}else {
			return em.merge(student);
		}
	}

	@Override
	public List<Student> findAllStudent() throws DataAccessException {
		return this.studentJpaRepository.findAll();
	}

}
