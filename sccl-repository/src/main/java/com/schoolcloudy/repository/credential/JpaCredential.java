package com.schoolcloudy.repository.credential;

import com.schoolcloudy.model.shared.entities.Credential;
import com.schoolcloudy.repository.user.UserRepository;

public interface JpaCredential extends UserRepository<Credential, Long> {

}
