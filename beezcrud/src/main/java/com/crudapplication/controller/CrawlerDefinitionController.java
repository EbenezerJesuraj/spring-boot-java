package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerDefinition;
//import com.crudapplication.repository.CrawlerDefinitionPagingRepository;
import com.crudapplication.service.CrawlerDefinitionService;
//import com.crudapplication.service.Predicate;
import com.querydsl.core.types.Predicate;

import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import java.lang.Integer;
import java.util.List;

@AllArgsConstructor

@RestController 
@RequestMapping("/crawlerdef")
public class CrawlerDefinitionController {

    private CrawlerDefinitionService crawlerDefinitionService;
    // private CrawlerDefinitionPagingRepository CrawlerDefinitionPagingRepository;
    
    // public void CrawlerDefinitionControllerResource(CrawlerDefinitionPagingRepository CrawlerDefinitionPagingRepository) {
    //     this.CrawlerDefinitionPagingRepository = CrawlerDefinitionPagingRepository;
    // }
    
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
    public ResponseEntity<CrawlerDefinition> getCrawlerDefinitionById(@PathVariable("id") Long CrawlerDefinitionId){
        CrawlerDefinition CrawlerDefinition = crawlerDefinitionService.getCrawlerDefinitionById(CrawlerDefinitionId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(CrawlerDefinition, HttpStatus.OK);
    }

    /*
    // Build Get All CrawlerDefinition REST API
    // http://localhost:8080/api/CrawlerDefinitions
    //@RequestMapping("/get")
    */
    
    @GetMapping
    public ResponseEntity<List<CrawlerDefinition>> getAllCrawlerDefinition(@QuerydslPredicate(root = CrawlerDefinition.class) Predicate predicate, @RequestParam(defaultValue = "0") Integer pageNo,
    @RequestParam(defaultValue = "10") Integer pageSize)
    
    {
        // The above request parameters must be added in the args section of getAllCrawlerDefinition to allow paging support
        System.out.println("Inside of GetMapping");
        List<CrawlerDefinition>CrawlerDefinition = crawlerDefinitionService.getAllCrawlerDefinition(predicate, pageNo, pageSize);
        return new ResponseEntity<>(CrawlerDefinition, HttpStatus.OK);
    }
    // Build Update CrawlerDefinition REST API
    // http://localhost:8080/api/CrawlerDefinitions/1

    @PutMapping("{id}")
       public ResponseEntity<CrawlerDefinition> updateCrawlerDefinition(@PathVariable("id") Long CrawlerDefinitionId,
                                           @RequestBody CrawlerDefinition CrawlerDefinition){
        
        CrawlerDefinition.setId(CrawlerDefinitionId);
        System.out.println("Inside of updateMapping");
        CrawlerDefinition updatedCrawlerDefinition = crawlerDefinitionService.createCrawlerDefinition(CrawlerDefinition);
        return new ResponseEntity<>(updatedCrawlerDefinition, HttpStatus.OK);
    }

    /* 
    private CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition CrawlerDefinition) {
        return null;
    }
    */

    // Build Delete CrawlerDefinition REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerDefinition(@PathVariable("id") Long CrawlerDefinitionId){
        CrawlerDefinitionService.deleteCrawlerDefinition(CrawlerDefinitionId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerDefinition successfully deleted!", HttpStatus.OK);
    }
}
