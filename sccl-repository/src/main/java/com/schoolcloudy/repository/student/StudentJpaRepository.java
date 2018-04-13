package com.schoolcloudy.repository.student;

import com.schoolcloudy.model.entities.Student;
import com.schoolcloudy.repository.user.UserRepository;

public interface StudentJpaRepository extends UserRepository<Student, Long> {

}
