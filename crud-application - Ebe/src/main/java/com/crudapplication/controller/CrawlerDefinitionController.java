public package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/* 
@RestController  
public class CrudApplicationController { 
@RequestMapping("/")  
public String hello()   
    {  
        return "Hello CrawlerDefinition";  
    }
*/



@AllArgsConstructor

@RestController 
@RequestMapping("/start")
public class CrawlerDefinitionController {

    private CrawlerDefinitionController CrawlerDefinitionService;
    
      
    // build create CrawlerDefinition REST API
    //@RequestMapping("/post")
    @PostMapping
    public CrawlerDefinition createCrawlerDefinition(@RequestBody CrawlerDefinition CrawlerDefinition){
        System.out.println("Inside of PostMapping");
        CrawlerDefinition savedCrawlerDefinition = CrawlerDefinitionService.createCrawlerDefinition(CrawlerDefinition);
        return new ResponseEntity<>(savedCrawlerDefinition, HttpStatus.CREATED);
    }

    // build get CrawlerDefinition by id REST API
    // http://localhost:8080/api/CrawlerDefinitions/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public CrawlerDefinition getCrawlerDefinitionById(@PathVariable("id") Long CrawlerDefinitionId){
        CrawlerDefinition CrawlerDefinition = CrawlerDefinitionService.getCrawlerDefinitionById(CrawlerDefinitionId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(CrawlerDefinition, HttpStatus.OK);
    }

    // Build Get All CrawlerDefinitions REST API
    // http://localhost:8080/api/CrawlerDefinitions
    //@RequestMapping("/get")
    @GetMapping
    public List<CrawlerDefinition> getAllCrawlerDefinitions(){
        List<CrawlerDefinition> CrawlerDefinitions = CrawlerDefinitionService.getAllCrawlerDefinitions();
        System.out.println("Inside of GetMapping");
        return new ResponseEntity<>(CrawlerDefinition, HttpStatus.OK);
    }

    // Build Update CrawlerDefinition REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDefinitions/1
    public ResponseEntity<CrawlerDefinition> updateCrawlerDefinition(@PathVariable("id") Long CrawlerDefinitionId,
                                           @RequestBody CrawlerDefinition CrawlerDefinition){
        
        CrawlerDefinition.setId(CrawlerDefinitionId);
        System.out.println("Inside of updateMapping");
        CrawlerDefinition updatedCrawlerDefinition = CrawlerDefinitionService.updateCrawlerDefinition(CrawlerDefinition);
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
 CrawlerDefinitionController {
    
}
