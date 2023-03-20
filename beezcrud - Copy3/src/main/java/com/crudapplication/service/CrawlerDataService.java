package com.crudapplication.service;

//import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;
  
import java.util.List;

public interface CrawlerDataService {
    CrawlerData createCrawlerData(CrawlerData crawlerData);

    CrawlerData getCrawlerDataById(Long crawlerDataId);

    List<CrawlerData> getAllCrawlerData();

    CrawlerData updateCrawlerData(CrawlerData crawlerData);

    CrawlerData setId(Long crawlerDataId);

   // CrawlerData getProductURL(String productURL);

    void deleteCrawlerData(Long crawlerDataId);
}
