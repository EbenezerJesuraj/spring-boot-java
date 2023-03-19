package net.springboot.service;

import net.springboot.entity.CrawlerDefinition;

import java.util.List;

public interface CrawlerDefinition {

    CrawlerDefinition createCrawlerDefinition(CrawlerDefinition CrawlerDefinition);

    CrawlerDefinition readCrawlerDefinition(Long CrawlerId);

    //List<User> getAllUsers();

    CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition CrawlerDefinition);

    void deleteCrawlerDefinition(Long CrawlerId);
}