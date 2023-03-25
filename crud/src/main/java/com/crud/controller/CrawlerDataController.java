package com.crud.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/CrawlerData")
public class CrawlerDataController<CrawlerDataService, CrawlerData> {

    private CrawlerDataService CrawlerDataService;

    // build create CrawlerData REST API
    @PostMapping
    public <CrawlerData> ResponseEntity<CrawlerDataController> createCrawlerData(@RequestBody CrawlerData CrawlerData){
        CrawlerData savedCrawlerData = CrawlerDataService.createCrawlerData(CrawlerData);
        return new ResponseEntity<>(savedCrawlerData, HttpStatus.CREATED);
    }

    // build get CrawlerData by id REST API
    // http://localhost:8080/api/CrawlerDatas/1
    @GetMapping("{id}")
    public ResponseEntity<CrawlerData> getCrawlerDataById(@PathVariable("id") Long CrawlerDataId){
        CrawlerData CrawlerData = CrawlerDataService.getCrawlerDataById(CrawlerDataId);
        return new ResponseEntity<>(CrawlerData, HttpStatus.OK);
    }

    // Build Get All CrawlerDatas REST API
    // http://localhost:8080/api/CrawlerDatas
    @GetMapping
    public ResponseEntity<List<CrawlerData>> getAllCrawlerDatas(){
        List<CrawlerData> CrawlerDatas = CrawlerDataService.getAllCrawlerDatas();
        return new ResponseEntity<>(CrawlerDatas, HttpStatus.OK);
    }

    // Build Update CrawlerData REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDatas/1
    public ResponseEntity<CrawlerData> updateCrawlerData(@PathVariable("id") Long CrawlerDataId,
                                           @RequestBody CrawlerData CrawlerData){
        CrawlerData.setId(CrawlerDataId);
        CrawlerData updatedCrawlerData = CrawlerDataService.updateCrawlerData(CrawlerData);
        return new ResponseEntity<>(updatedCrawlerData, HttpStatus.OK);
    }

    // Build Delete CrawlerData REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerData(@PathVariable("id") Long CrawlerDataId){
        CrawlerDataService.deleteCrawlerData(CrawlerDataId);
        return new ResponseEntity<>("CrawlerData successfully deleted!", HttpStatus.OK);
    }
}