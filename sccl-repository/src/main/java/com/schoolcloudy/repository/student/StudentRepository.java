package com.schoolcloudy.repository.student;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.schoolcloudy.model.entities.Student;



public interface StudentRepository {
	Student save(Student student) throws DataAccessException;
	List<Student> findAllStudent() throws DataAccessException;
}
