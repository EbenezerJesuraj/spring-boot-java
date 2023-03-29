package com.crudapplication.repository;

import java.util.function.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrawlerDataPagingRepositoryCustom<CrawlerData> {

    Page<CrawlerData> findAll(Predicate<CrawlerData> predicate,Pageable pageable);
}