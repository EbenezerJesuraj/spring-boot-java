package com.crudapplication.repository;

import com.crudapplication.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
//import  org.springframework.data.jpa.repository.support;
//import org.springframework.data.jpa.repository.*;


public interface CrawlerDataRepository extends JpaRepository <CrawlerData, Long>, CrawlerDataRepositoryCustom <CrawlerData> {

// public interface CrawlerDataRepository extends QueryDslJpaRepository <CrawlerData, Long> {
      
}