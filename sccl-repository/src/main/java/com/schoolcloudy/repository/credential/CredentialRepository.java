package com.schoolcloudy.repository.credential;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.schoolcloudy.model.shared.entities.Credential;
import com.schoolcloudy.model.shared.entities.User;


public interface CredentialRepository {
	boolean checkUserCredential(String username, String password) throws DataAccessException;
	Credential save(Credential credential) throws DataAccessException;
	List<Credential> findAll() throws DataAccessException;
	Credential getUserWithUsername(String username) throws DataAccessException;
	Credential setUserCredential(User user) throws DataAccessException;
}
