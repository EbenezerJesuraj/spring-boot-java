package com.crudapplication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerData;

public interface CrawlerDataPagingRepository extends PagingAndSortingRepository<CrawlerData, Integer> {

}