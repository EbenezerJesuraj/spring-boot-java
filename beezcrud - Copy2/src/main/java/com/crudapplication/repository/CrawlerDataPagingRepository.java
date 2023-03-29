package com.crudapplication.repository;

import java.util.function.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerData;

public interface CrawlerDataPagingRepository extends PagingAndSortingRepository<CrawlerData, Integer>, QuerydslPredicateExecutor<CrawlerData>, JpaRepository {

    static // Predicate<CrawlerData> predicate,
    //Page < CrawlerData > findAll(Pageable pageable);
    Page < CrawlerData > findAll(Predicate<CrawlerData> predicate, Pageable pageable){
        String sortBy = "id";
        String sortDir = "ASC";

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Page<CrawlerData> page = CrawlerDataPagingRepository.findAll(predicate, pageable);
        return (Page<CrawlerData>) page.getContent();

    }
}