package com.crudapplication.service;

import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;
  
import java.util.List;

public interface CrawlerDataService {
    CrawlerData createCrawlerData(CrawlerData CrawlerData);

    CrawlerData getCrawlerDataById(Long CrawlerDataId);

    List<CrawlerData> getAllCrawlerDatas();

    CrawlerDataController updateCrawlerData(CrawlerDataController crawlerData);

    CrawlerData setId(Long CrawlerDataId);

    void deleteCrawlerData(Long CrawlerDataId);
}
