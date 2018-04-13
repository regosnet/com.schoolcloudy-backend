package com.schoolcloudy.service.administrative;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.schoolcloudy.model.entities.Administrator;
import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.model.shared.entities.User;
import com.schoolcloudy.repository.credential.CredentialRepository;
import com.schoolcloudy.repository.staff.AdministratorRepository;
import com.schoolcloudy.repository.student.StudentRepository;


@Service
@Transactional
public class AdministrativeServiceImpl implements AdministrativeService {

	@Autowired
	private AdministratorRepository administratorRepository;

	@Autowired
	private CredentialRepository credentialRepository;

	@Autowired
	private StudentRepository studentRepository;
/*
	@Override
	@Transactional(readOnly=true)
	public List<School> getSchoolInformation() {
		return null;
	} 
*/
	@Override
	public boolean isAdministratorExist(Administrator administrator) throws DataAccessException {
		// finds all administrators and compare them to the new administrator using equals and hashcode method
		return false;
	}

	@Override
	public Administrator addNewAdministrator(Administrator administrator) throws DataAccessException {
		if(administrator.getInternalId() == null) {
			administrator.setExternalId(externalIdGenerator(administrator));
			administrator.setCredential(credentialRepository.setUserCredential(administrator));
		}
		return administratorRepository.save(administrator);
	}

	@Override
	public User getUser(String username, String password) throws DataAccessException {
		Predicate<User> user = x -> (x.getFirstName() +"."+ x.getLastName()).equalsIgnoreCase(username);
		if(!credentialRepository.checkUserCredential(username, password)) return null;
		if(credentialRepository.getUserWithUsername(username).getUser().equals("Administrator")) {
			return administratorRepository.findAllAdministrator().stream().filter(user).findAny().get();
		}else if(credentialRepository.getUserWithUsername(username).getUser().equals("Student")) {
			return studentRepository.findAllStudent().stream().filter(user).findFirst().get();
		}else if(credentialRepository.getUserWithUsername(username).getUser().equals("AcademicStaff")){
			return null;
		}else {

			return null;
		}
	}

	@Override
	public Student addNewstudent(Student student) throws DataAccessException {
		if(student.getInternalId() == null){
			student.setExternalId(externalIdGenerator(student));
			student.setCredential(credentialRepository.setUserCredential(student));
		}
		return studentRepository.save(student);
	}
/*
	@Override
	public Faculty createNewFaculty(Faculty newFaculty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School addNewSchool(School newSchool) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public long updateNumberOfFaculty() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String externalIdGenerator(User user) throws DataAccessException{
		String externalIdFormat = null;
		switch(user.getUser()){
		case "Administrator":
			long adminCount = administratorRepository.countAdministrators() + 1L;
			externalIdFormat = "SC01ADMIN00" + adminCount ;
			break;
		case "Student": 
			int studentCount = studentRepository.findAllStudent().size() + 1;
			externalIdFormat = "SC01EEST00" + studentCount;
			break;
		}

		return externalIdFormat;
	}

	@Override
	public Administrator getAdministratorByIds(long internalId, String externalId) throws DataAccessException {
		return this.administratorRepository.findOneByIds(internalId, externalId);
	}

	@Override
	public List<Student> getStudents() throws DataAccessException {
		return this.studentRepository.findAllStudent();
	}

	@Override
	public List<Administrator> getAdministrators() throws DataAccessException {
		return this.administratorRepository.findAllAdministrator();
	}
}
