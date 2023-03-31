package com.crudapplication.service;

import com.crudapplication.entity.CrawlerDefinition;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface CrawlerDefinitionService {
    CrawlerDefinition createCrawlerDefinition(CrawlerDefinition crawlerDefinition);

    CrawlerDefinition getCrawlerDefinitionById(Long crawlerDefinitionId);

    List<CrawlerDefinition> getAllCrawlerDefinition(Predicate predicate, Integer pageNo, Integer pageSize);
    
    //List<CrawlerDefinition> getAllCrawlerDefinition(Integer pageNo, Integer pageSize);

    CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition crawlerDefinition);

    CrawlerDefinition setId(Long crawlerDefinitionId);

    static void deleteCrawlerDefinition(Long crawlerDefinitionId){
        
    }
}
