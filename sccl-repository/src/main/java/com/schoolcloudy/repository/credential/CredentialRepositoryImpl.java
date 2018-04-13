package com.schoolcloudy.repository.credential;

import java.util.Date;
import java.util.List;
import java.util.Random;

import static java.lang.Math.round;
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.min;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.schoolcloudy.model.shared.entities.Credential;
import com.schoolcloudy.model.shared.entities.User;


@Repository
public class CredentialRepositoryImpl implements CredentialRepository{
	static final Random random = new Random(); // Or SecureRandom
	static final int startChar = (int) '!';
	static final int endChar = (int) '~';

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private JpaCredential credential;
	

	@Override
	public Credential save(Credential credential) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Credential> findAll() {
		return credential.findAll(); 
	}
	
	@Override
	public boolean checkUserCredential(String username, String password) throws DataAccessException {
		return this.findAll().stream()
				.anyMatch(x -> x.getUsername().equalsIgnoreCase(username) 
						&& x.getPassword().equalsIgnoreCase(password));
	}

	@Override
	public Credential getUserWithUsername(String username) throws DataAccessException {
		return em.createQuery("SELECT user FROM Credential user WHERE user.username=:username", Credential.class)
				.setParameter("username", username).getSingleResult();
	}

	@Override
	public Credential setUserCredential(User user) throws DataAccessException {
		Credential newUserCredential = new Credential();
		newUserCredential.setLastLogin(new Date());
		newUserCredential.setUsername(this.createUsername(user));
		newUserCredential.setPassword(tmpPwdGen(11));
		newUserCredential.setUser(user.getUser());
		newUserCredential.setUserId(user.getExternalId());
		return newUserCredential;
	}

	// Generates temporary password	
	private static String tmpPwdGen(final int maxLength) {
		  final int length = random.nextInt(maxLength + 1);
		  return random.ints(length, startChar, endChar + 1)
		        .mapToObj((i) -> (char) i)
		        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
		        .toString();
		}

	private String createUsername(User user) {
		return user.getFirstName() +"."+user.getLastName();
	}
	
}
