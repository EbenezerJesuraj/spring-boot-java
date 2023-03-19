package com.crudapplication.repository;

import com.crudapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrawlerDataRepository extends JpaRepository <User, Long> {
    
}