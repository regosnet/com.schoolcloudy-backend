package com.schoolcloudy.repository.staff;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.schoolcloudy.model.entities.Administrator;

public interface AdministratorRepository {
	List<Administrator> findAllAdministrator() throws DataAccessException;
	Administrator save(Administrator administrator) throws DataAccessException;
	long countAdministrators() throws DataAccessException;
	Administrator findOneByIds(long internalId, String externalId) throws DataAccessException;
	
}
