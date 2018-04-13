package com.schoolcloudy.service.administrative;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.model.shared.entities.User;


public interface AdministrativeService {
	/*List<School> getSchoolInformation();
	Faculty createNewFaculty(Faculty newFaculty);
	School addNewSchool(School newSchool);*/
	long updateNumberOfFaculty();
	boolean isAdministratorExist(Administrator administrator) throws DataAccessException;
	Administrator addNewAdministrator(Administrator administrator) throws DataAccessException;
	Administrator getAdministratorByIds(long internalId, String externalId) throws DataAccessException;
	List<Administrator> getAdministrators() throws DataAccessException;
	User getUser(String username, String password) throws DataAccessException;
	
	Student addNewstudent(Student student) throws DataAccessException;
	List<Student> getStudents() throws DataAccessException;
}
 