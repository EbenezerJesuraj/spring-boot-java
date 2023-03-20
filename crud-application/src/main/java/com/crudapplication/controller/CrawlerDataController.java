public package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerData;
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
        return "Hello CrawlerData";  
    }
*/



@AllArgsConstructor

@RestController 
@RequestMapping("/crawlerdata")
public class CrawlerDataController {

    private CrawlerDataController CrawlerDataService;
    
      
    // build create CrawlerData REST API
    //@RequestMapping("/post")
    @PostMapping
    public CrawlerData createCrawlerData(@RequestBody CrawlerData CrawlerData){
        System.out.println("Inside of PostMapping");
        CrawlerData savedCrawlerData = CrawlerDataService.createCrawlerData(CrawlerData);
        return new ResponseEntity<>(savedCrawlerData, HttpStatus.CREATED);
    }

    // build get CrawlerData by id REST API
    // http://localhost:8080/api/CrawlerDatas/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public CrawlerData getCrawlerDataById(@PathVariable("id") Long CrawlerDataId){
        CrawlerData CrawlerData = CrawlerDataService.getCrawlerDataById(CrawlerDataId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(CrawlerData, HttpStatus.OK);
    }

    // Build Get All CrawlerData REST API
    // http://localhost:8080/api/CrawlerDatas
    //@RequestMapping("/get")
    @GetMapping
    public List<CrawlerData> getAllCrawlerDatas(){
        List<CrawlerData> CrawlerData = CrawlerDataService.getAllCrawlerDatas();
        System.out.println("Inside of GetMapping");
        return new ResponseEntity<>(CrawlerData, HttpStatus.OK);
    }

    // Build Update CrawlerData REST API
     // http://localhost:8080/api/CrawlerDatas/1

    @PutMapping("{id}")
       public ResponseEntity<CrawlerData> updateCrawlerData(@PathVariable("id") Long CrawlerDataId,
                                           @RequestBody CrawlerData CrawlerData){
        
        CrawlerData.setId(CrawlerDataId);
        System.out.println("Inside of updateMapping");
        CrawlerData updatedCrawlerData = CrawlerDataService.updateCrawlerData(CrawlerData);
        return new ResponseEntity<>(updatedCrawlerData, HttpStatus.OK);
    }

    /* 
    private CrawlerData updateCrawlerData(CrawlerData CrawlerData) {
        return null;
    }
    */

    // Build Delete CrawlerData REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerData(@PathVariable("id") Long CrawlerDataId){
        CrawlerDataService.deleteCrawlerData(CrawlerDataId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerData successfully deleted!", HttpStatus.OK);
    }
}
 CrawlerDataController {
    
}
