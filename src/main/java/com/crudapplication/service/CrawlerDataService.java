package com.crudapplication.service;

//import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface CrawlerDataService {
    CrawlerData createCrawlerData(CrawlerData crawlerData);

    CrawlerData getCrawlerDataById(Long crawlerDataId);

    List<CrawlerData> getAllCrawlerData(Predicate predicate, Integer pageNo, Integer pageSize);
    
    //List<CrawlerData> getAllCrawlerData(Integer pageNo, Integer pageSize);

    CrawlerData updateCrawlerData(CrawlerData crawlerData);

    CrawlerData setId(Long crawlerDataId);

    void deleteCrawlerData(Long crawlerDataId);
}