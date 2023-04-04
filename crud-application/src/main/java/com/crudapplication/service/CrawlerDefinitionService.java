package com.crudapplication.service;

import com.crudapplication.controller.CrawlerDefinitionController;
import com.crudapplication.entity.CrawlerDefinition;
  
import java.util.List;

public interface CrawlerDefinitionService {
    CrawlerDefinition createCrawlerDefinition(CrawlerDefinition CrawlerDefinition);

    CrawlerDefinition getCrawlerDefinitionById(Long CrawlerDefinitionId);

    List<CrawlerDefinition> getAllCrawlerDefinitions();

    CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition CrawlerDefinition);

    CrawlerDefinition setId(Long CrawlerDefinitionId);

    void deleteCrawlerDefinition(Long CrawlerDefinitionId);
}
