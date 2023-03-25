package com.crudtutorial.repository;

import com.crudtutorial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    
}