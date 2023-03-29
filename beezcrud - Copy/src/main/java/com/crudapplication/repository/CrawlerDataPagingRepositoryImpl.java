package com.crudapplication.repository;

import java.util.function.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.crudapplication.entity.CrawlerData;



public class CrawlerDataPagingRepositoryImpl implements CrawlerDataPagingRepositoryCustom<CrawlerData>, QueryDslPredicateExecutor<CrawlerData> {

    @Override
    public Page<CrawlerData> findAll(Predicate<CrawlerData> predicate, Pageable pageable) {
        
        //private final CrawlerDataPagingRepository crawlerDataPagingRepository;
        
        Page<CrawlerData> pagedResult = CrawlerDataPagingRepository.findAll(predicate, pageable);
        return (Page<CrawlerData>)pagedResult.getContent();
        
    }

   
    // your code
}

