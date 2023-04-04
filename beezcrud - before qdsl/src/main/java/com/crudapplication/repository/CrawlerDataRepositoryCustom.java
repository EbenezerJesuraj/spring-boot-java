package com.crudapplication.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.crudapplication.service.Impl.Predicate;

public interface CrawlerDataRepositoryCustom<CrawlerData> {
    List<CrawlerData> findAll(Predicate predicate, Pageable pageable);
}