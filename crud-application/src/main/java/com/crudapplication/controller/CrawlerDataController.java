package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerData;
import com.crudapplication.service.CrawlerDataService;
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
@RequestMapping("/start")
public class CrawlerData

    private CrawlerDataService CrawlerDataService;
    
      
    // build create CrawlerData REST API
    //@RequestMapping("/post")
    @PostMapping
    public ResponseEntity<CrawlerData> createCrawlerData(@RequestBody CrawlerData CrawlerData){
        System.out.println("Inside of PostMapping");
        CrawlerData savedCrawlerData = CrawlerDataService.createCrawlerData(CrawlerData);
        return new ResponseEntity<>(savedCrawlerData, HttpStatus.CREATED);
    }

    // build get CrawlerData by id REST API
    // http://localhost:8080/api/CrawlerDatas/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public ResponseEntity<CrawlerData> getCrawlerDataById(@PathVariable("id") Long CrawlerDataId){
        CrawlerData CrawlerData = CrawlerDataService.getCrawlerDataById(CrawlerDataId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(CrawlerData, HttpStatus.OK);
    }

    // Build Get All CrawlerDatas REST API
    // http://localhost:8080/api/CrawlerDatas
    //@RequestMapping("/get")
    @GetMapping
    public ResponseEntity<List<CrawlerData>> getAllCrawlerDatas(){
        List<CrawlerData> CrawlerDatas = CrawlerDataService.getAllCrawlerDatas();
        System.out.println("Inside of GetMapping");
        return new ResponseEntity<>(CrawlerDatas, HttpStatus.OK);
    }

    // Build Update CrawlerData REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDatas/1
    public ResponseEntity<CrawlerData> updateCrawlerData(@PathVariable("id") Long CrawlerDataId,
                                           @RequestBody CrawlerData CrawlerData){
        
        CrawlerData.setId(CrawlerDataId);
        System.out.println("Inside of updateMapping");
        CrawlerData updatedCrawlerData = CrawlerDataService.updateCrawlerData(CrawlerData);
        return new ResponseEntity<>(updatedCrawlerData, HttpStatus.OK);
    }

    // Build Delete CrawlerData REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerData(@PathVariable("id") Long CrawlerDataId){
        CrawlerDataService.deleteCrawlerData(CrawlerDataId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerData successfully deleted!", HttpStatus.OK);
    }
}
