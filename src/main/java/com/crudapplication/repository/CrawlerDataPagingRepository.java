package com.crudapplication.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerData;


public interface CrawlerDataPagingRepository extends PagingAndSortingRepository<CrawlerData, Long> , QuerydslPredicateExecutor<CrawlerData>  {
}