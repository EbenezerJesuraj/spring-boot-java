package com.crudapplication.service;

//import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;

import java.util.List;
import java.util.function.Predicate;

public interface CrawlerDataService {
    CrawlerData createCrawlerData(CrawlerData crawlerData);

    CrawlerData getCrawlerDataById(Long crawlerDataId);

    //List<CrawlerData> getAllCrawlerData();

    //List<CrawlerData> getAllCrawlerData(Predicate<CrawlerData> predicate, Pageable pageable);
    //Predicate<CrawlerData> predicate,
    //List<CrawlerData> getAllCrawlerData( Integer pageNo, Integer pageSize);
    List<CrawlerData> getAllCrawlerData( Predicate<CrawlerData> predicate, Integer pageNo, Integer pageSize);
    CrawlerData updateCrawlerData(CrawlerData crawlerData);

    CrawlerData setId(Long crawlerDataId);

   // CrawlerData getProductURL(String productURL);

    void deleteCrawlerData(Long crawlerDataId);
}
