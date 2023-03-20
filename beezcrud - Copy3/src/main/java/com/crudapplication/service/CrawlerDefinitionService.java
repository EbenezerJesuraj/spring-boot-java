package com.crudapplication.service;

//import com.crudapplication.controller.CrawlerDefinitionController;
import com.crudapplication.entity.CrawlerDefinition;
  
import java.util.List;

public interface CrawlerDefinitionService {
    CrawlerDefinition createCrawlerDefinition(CrawlerDefinition crawlerDefinition);

    CrawlerDefinition getCrawlerDefinitionById(Long crawlerDefinitionId);

    List<CrawlerDefinition> getAllCrawlerDefinitions();

    CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition crawlerDefinition);

    CrawlerDefinition setId(Long crawlerDefinitionId);

    void deleteCrawlerDefinition(Long crawlerDefinitionId);
}
