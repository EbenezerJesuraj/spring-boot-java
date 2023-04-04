package com.crudapplication.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerDefinition;


public interface CrawlerDefinitionPagingRepository extends PagingAndSortingRepository<CrawlerDefinition, Long> , QuerydslPredicateExecutor<CrawlerDefinition>  {
}