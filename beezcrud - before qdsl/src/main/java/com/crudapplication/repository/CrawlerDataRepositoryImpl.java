package com.crudapplication.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.crudapplication.service.Impl.Predicate;

public class CrawlerDataRepositoryImpl implements CrawlerDataRepositoryCustom {

    @Override
    public List findAll(Predicate predicate, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}