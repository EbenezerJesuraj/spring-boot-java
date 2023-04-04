package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerData;
//import com.crudapplication.repository.CrawlerDataPagingRepository;
import com.crudapplication.service.CrawlerDataService;
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
@RequestMapping("/crawler")
public class CrawlerDataController {

    private CrawlerDataService crawlerDataService;
    // private CrawlerDataPagingRepository crawlerDataPagingRepository;
    
    // public void CrawlerDataControllerResource(CrawlerDataPagingRepository crawlerDataPagingRepository) {
    //     this.crawlerDataPagingRepository = crawlerDataPagingRepository;
    // }
    
    // build create CrawlerData REST API
    //@RequestMapping("/post")
    @PostMapping
    public ResponseEntity<CrawlerData> createCrawlerData(@RequestBody CrawlerData crawlerData){
        System.out.println("Inside of PostMapping");
        CrawlerData savedCrawlerData = crawlerDataService.createCrawlerData(crawlerData);
        return new ResponseEntity<>(savedCrawlerData, HttpStatus.CREATED);
    }

    // build get CrawlerData by id REST API
    // http://localhost:8080/api/CrawlerDatas/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public ResponseEntity<CrawlerData> getCrawlerDataById(@PathVariable("id") Long crawlerDataId){
        CrawlerData crawlerData = crawlerDataService.getCrawlerDataById(crawlerDataId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(crawlerData, HttpStatus.OK);
    }

    /*
    // Build Get All CrawlerData REST API
    // http://localhost:8080/api/CrawlerDatas
    //@RequestMapping("/get")
    */
    
    @GetMapping
    public ResponseEntity<List<CrawlerData>> getAllCrawlerData(@QuerydslPredicate(root = CrawlerData.class) Predicate predicate, @RequestParam(defaultValue = "0") Integer pageNo,
    @RequestParam(defaultValue = "10") Integer pageSize)
    
    {
        // The above request parameters must be added in the args section of getAllCrawlerData to allow paging support
        System.out.println("Inside of GetMapping");
        List<CrawlerData>crawlerData = crawlerDataService.getAllCrawlerData(predicate, pageNo, pageSize);
        return new ResponseEntity<>(crawlerData, HttpStatus.OK);
    }
    // Build Update CrawlerData REST API
    // http://localhost:8080/api/CrawlerDatas/1

    @PutMapping("{id}")
       public ResponseEntity<CrawlerData> updateCrawlerData(@PathVariable("id") Long crawlerDataId,
                                           @RequestBody CrawlerData crawlerData){
        
        crawlerData.setId(crawlerDataId);
        System.out.println("Inside of updateMapping");
        CrawlerData updatedCrawlerData = crawlerDataService.createCrawlerData(crawlerData);
        return new ResponseEntity<>(updatedCrawlerData, HttpStatus.OK);
    }

    /* 
    private CrawlerData updateCrawlerData(CrawlerData CrawlerData) {
        return null;
    }
    */

    // Build Delete CrawlerData REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerData(@PathVariable("id") Long crawlerDataId){
        crawlerDataService.deleteCrawlerData(crawlerDataId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("CrawlerData successfully deleted!", HttpStatus.OK);
    }
}
 