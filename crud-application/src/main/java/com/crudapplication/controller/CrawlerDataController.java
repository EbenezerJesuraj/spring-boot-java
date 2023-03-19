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
public class CrawlerDataController<CrawlerDataService>

    private CrawlerDataService CrawlerDataService;
    
      
    // build create CrawlerData REST API
    //@RequestMapping("/post")
    @PostMapping
    public ResponseEntity<CrawlerDataController> createCrawlerData(@RequestBody CrawlerDataController CrawlerData){
        System.out.println("Inside of PostMapping");
        ResponseEntity savedCrawlerData = ((CrawlerDataController) CrawlerDataService).createCrawlerData(CrawlerData);
        return new ResponseEntity<CrawlerData>(savedCrawlerData, HttpStatus.CREATED);
    }

    // build get CrawlerData by id REST API
    // http://localhost:8080/api/CrawlerDatas/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public ResponseEntity<CrawlerDataController> getCrawlerDataById(@PathVariable("id") Long CrawlerDataId){
        CrawlerData CrawlerData = ((com.crudapplication.service.CrawlerDataService) CrawlerDataService).getCrawlerDataById(CrawlerDataId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(CrawlerData, HttpStatus.OK);
    }

    // Build Get All CrawlerDatas REST API
    // http://localhost:8080/api/CrawlerDatas
    //@RequestMapping("/get")
    @GetMapping
    public ResponseEntity<List<CrawlerDataController>> getAllCrawlerDatas(){
        List<CrawlerData> CrawlerDatas = ((com.crudapplication.service.CrawlerDataService) CrawlerDataService).getAllCrawlerDatas();
        System.out.println("Inside of GetMapping");
        return new ResponseEntity<>(CrawlerDatas, HttpStatus.OK);
    }

    // Build Update CrawlerData REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDatas/1
    public ResponseEntity<CrawlerDataController> updateCrawlerData(@PathVariable("id") Long CrawlerDataId,
                                           @RequestBody CrawlerDataController CrawlerData){
        
        CrawlerData.setId(CrawlerDataId);
        System.out.println("Inside of updateMapping");
        CrawlerDataController updatedCrawlerData = ((com.crudapplication.service.CrawlerDataService) CrawlerDataService).updateCrawlerData(CrawlerData);
        return new ResponseEntity<>(updatedCrawlerData, HttpStatus.OK);
    }

    private void setId(Long crawlerDataId) {
    }

    // Build Delete CrawlerData REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerData(@PathVariable("id") Long CrawlerDataId){
        ((com.crudapplication.service.CrawlerDataService) CrawlerDataService).deleteCrawlerData(CrawlerDataId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerData successfully deleted!", HttpStatus.OK);
    }
}
