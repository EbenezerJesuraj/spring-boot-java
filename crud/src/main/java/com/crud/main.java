package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.service.CrawlerDataServiceImpl;
import com.crud.service.CrawlerDefinitionServiceImpl;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
		SpringApplication.run(main.class, args);
		//SpringApplication.run(CrawlerDataServiceImpl.class, args);
		//SpringApplication.run(CrawlerDefinitionServiceImpl.class, args);
		CrawlerDefinitionServiceImpl CrawlerDefn;
		CrawlerDefn.createCrawlerDefinition(null);
	}

}
