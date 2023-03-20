package com.crudapplication.repository;

import com.crudapplication.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {
    
}

/* 
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    Optional<User> findAll(Long userId);
}

*/