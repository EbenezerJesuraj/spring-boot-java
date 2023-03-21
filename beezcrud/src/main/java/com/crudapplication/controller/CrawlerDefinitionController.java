package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerDefinition;
import com.crudapplication.service.CrawlerDefinitionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor

@RestController  
@RequestMapping("/crawlerdef")
public class CrawlerDefinitionController {

    private CrawlerDefinitionService crawlerDefinitionService;
    
      
    // build create CrawlerDefinition REST API
    //@RequestMapping("/post")
    @PostMapping
    public ResponseEntity<CrawlerDefinition> createCrawlerDefinition(@RequestBody CrawlerDefinition crawlerDefinition){
        System.out.println("Inside of PostMapping");
        CrawlerDefinition savedCrawlerDefinition = crawlerDefinitionService.createCrawlerDefinition(crawlerDefinition);
        return new ResponseEntity<>(savedCrawlerDefinition, HttpStatus.CREATED);
    }

    // build get CrawlerDefinition by id REST API
    // http://localhost:8080/api/CrawlerDefinitions/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public  ResponseEntity<CrawlerDefinition> getCrawlerDefinitionById(@PathVariable("id") Long crawlerDefinitionId){
        CrawlerDefinition crawlerDefinition = crawlerDefinitionService.getCrawlerDefinitionById(crawlerDefinitionId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(crawlerDefinition, HttpStatus.OK);
    }

    // Build Get All CrawlerDefinitions REST API
    // http://localhost:8080/api/CrawlerDefinitions
    //@RequestMapping("/get")
    @GetMapping
    public ResponseEntity<List<CrawlerDefinition>> getAllCrawlerDefinitions(){
        List<CrawlerDefinition> crawlerDefinitions = crawlerDefinitionService.getAllCrawlerDefinitions();
    
        return new ResponseEntity<>(crawlerDefinitions, HttpStatus.OK);
    }

    // Build Update CrawlerDefinition REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDefinitions/1
    public ResponseEntity<CrawlerDefinition> updateCrawlerDefinition(@PathVariable("id") Long crawlerDefinitionId,
                                           @RequestBody CrawlerDefinition crawlerDefinition){
        
        crawlerDefinition.setId(crawlerDefinitionId);
        System.out.println("Inside of updateMapping");
        CrawlerDefinition updatedCrawlerDefinition = crawlerDefinitionService.updateCrawlerDefinition(crawlerDefinition);
        return new ResponseEntity<>(updatedCrawlerDefinition, HttpStatus.OK);
    }

    

    // Build Delete CrawlerDefinition REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerDefinition(@PathVariable("id") Long crawlerDefinitionId){
        crawlerDefinitionService.deleteCrawlerDefinition(crawlerDefinitionId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerDefinition successfully deleted!", HttpStatus.OK);
    }
}
