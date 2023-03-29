package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;
//import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;
import com.crudapplication.repository.CrawlerDataPagingRepository;
import com.crudapplication.service.CrawlerDataService;
import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.lang.Integer;

@Service
@AllArgsConstructor
public class CrawlerDataServiceImpl implements CrawlerDataService {

    private CrawlerDataPagingRepository crawlerDataPagingRepository;

    @Autowired
    public void CrawlerDataService(CrawlerDataPagingRepository crawlerDataPagingRepository){
        this.crawlerDataPagingRepository = crawlerDataPagingRepository;
    }

    //private CrawlerDataPagingRepository crawlerDataPagingRepository;

    @Override
    public CrawlerData createCrawlerData(CrawlerData crawlerData) {
        System.out.println("Inside of creates CrawlerData");
        return crawlerDataPagingRepository.save(crawlerData);
    }

    @Override
    public CrawlerData getCrawlerDataById(Long crawlerDataId) {
        System.out.println("Inside of get CrawlerData by ID");
        Optional<CrawlerData> optionalCrawlerData = crawlerDataPagingRepository.findById(crawlerDataId);
        return optionalCrawlerData.get();
    }

    //@Autowired
    @Override
    public List<CrawlerData> getAllCrawlerData(Predicate predicate,
           Integer pageNo, Integer pageSize) {

    //public List<CrawlerData> getAllCrawlerData(Integer pageNo,Integer pageSize){
        
        String sortBy = "id";
        String sortDir = "ASC";

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        
        // create Pageable instance
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<CrawlerData> pagedResult = crawlerDataPagingRepository.findAll(predicate,pageable);
        
        
        if(pagedResult.hasContent())
            return pagedResult.getContent();
        return null;

        //return CrawlerDataPagingRepository.findAll();
    }
    
    @Override
    public void deleteCrawlerData(Long crawlerDataId) {
        crawlerDataPagingRepository.deleteById(crawlerDataId);
    }
 
 
   @Override
    public CrawlerData updateCrawlerData(CrawlerData crawlerData) {
        CrawlerData existingCrawlerData = crawlerDataPagingRepository.findById(crawlerData.getId()).get();
        existingCrawlerData.setCrawlerId(crawlerData.getCrawlerId());
        existingCrawlerData.setProductURL((crawlerData).getProductURL());
        existingCrawlerData.setValue1(crawlerData.getValue1());
        existingCrawlerData.setValue2(crawlerData.getValue2());
        existingCrawlerData.setValue3(crawlerData.getValue3());
        existingCrawlerData.setValue4(crawlerData.getValue4());
        final CrawlerData updatedCrawlerData = crawlerDataPagingRepository.save(existingCrawlerData);
        return updatedCrawlerData;
    }
    
    @Override
    public CrawlerData setId(Long crawlerDataId) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
    
}