package net.springboot.service;

import net.springboot.entity.CrawlerData;

import java.util.List;

public class CrawlerData {

    CrawlerData createCrawlerData(CrawlerData CrawlerData);

    CrawlerData readCrawlerData(Long CrawlerId);

    //List<User> getAllUsers();

    CrawlerData updateCrawlerData(CrawlerData CrawlerData);

    void deleteCrawlerData(Long CrawlerId);
}