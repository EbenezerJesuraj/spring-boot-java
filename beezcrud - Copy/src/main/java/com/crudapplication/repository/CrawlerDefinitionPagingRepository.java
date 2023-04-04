package com.crudapplication.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerDefinition;

public interface CrawlerDefinitionPagingRepository extends PagingAndSortingRepository<CrawlerDefinition, Integer> {

    /**
     * Returns all entities sorted by the given options.
     *
     * @param sort
     * @return all entities sorted by the given options
     */
    Iterable < CrawlerDefinition > findAll(Sort sort);

    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    Page < CrawlerDefinition > findAll(Pageable pageable);
}