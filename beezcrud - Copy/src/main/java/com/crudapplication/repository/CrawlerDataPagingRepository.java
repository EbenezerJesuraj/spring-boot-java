package com.crudapplication.repository;

import java.util.function.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerData;

public interface CrawlerDataPagingRepository extends PagingAndSortingRepository<CrawlerData, Integer>, QueryDslPredicateExecutor<CrawlerData> ,JpaRepository {

    /**
     * Returns all entities sorted by the given options.
     *
     * @param sort
     * @return all entities sorted by the given options
     */
    Iterable < CrawlerData > findAll(Sort sort);

    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     * @param predicate
     *
     * @param pageable
     * @return a page of entities
     */
    static // Predicate<CrawlerData> predicate,
    //Page < CrawlerData > findAll(Pageable pageable);
    Page < CrawlerData > findAll(Predicate<CrawlerData> predicate, Pageable pageable){
        return null;

    }

}