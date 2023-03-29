package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;

import com.crudapplication.entity.CrawlerData;
//import com.crudapplication.controller.CrawlerDefinitionController;
import com.crudapplication.entity.CrawlerDefinition;
import com.crudapplication.repository.CrawlerDefinitionPagingRepository;
import com.crudapplication.repository.CrawlerDefinitionRepository;
import com.crudapplication.service.CrawlerDefinitionService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDefinitionServiceImpl implements CrawlerDefinitionService {

    private CrawlerDefinitionRepository crawlerDefinitionRepository;
    private CrawlerDefinitionPagingRepository crawlerDefinitionPagingRepository;

    @Override
    public CrawlerDefinition createCrawlerDefinition(CrawlerDefinition CrawlerDefinition) {
        System.out.println("Inside of creates CrawlerDefinition");
        return crawlerDefinitionRepository.save(CrawlerDefinition);
    }

    @Override
    public CrawlerDefinition getCrawlerDefinitionById(Long crawlerDefinitionId) {
        System.out.println("Inside of get CrawlerDefinition by ID");
        Optional<CrawlerDefinition> optionalCrawlerDefinition = crawlerDefinitionRepository.findById(crawlerDefinitionId);
        return optionalCrawlerDefinition.get();
    }

    /* 
    @Override
    public List<CrawlerDefinition> getAllCrawlerDefinitions() {
        return crawlerDefinitionRepository.findAll();
    }
    */

    @Override
    public List<CrawlerDefinition> getAllCrawlerDefinitions(Integer pageNo,Integer pageSize){
        
        String sortBy = "id";
        String sortDir = "ASC";

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        
        // create Pageable instance
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        
        Page<CrawlerDefinition> pagedResult = crawlerDefinitionPagingRepository.findAll(pageable);
        
        if(pagedResult.hasContent())
            return pagedResult.getContent();
        return pagedResult.getContent();

        //return crawlerDataRepository.findAll();
    }


    @Override
    public CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition crawlerDefinition ) {
        CrawlerDefinition existingCrawlerDefinition = crawlerDefinitionRepository.findById(crawlerDefinition.getId()).get();
        existingCrawlerDefinition.setSiteName(crawlerDefinition.getSiteName());
        existingCrawlerDefinition.setFieldName1(crawlerDefinition.getFieldName1());
        existingCrawlerDefinition.setFieldName2(crawlerDefinition.getFieldName2());
        existingCrawlerDefinition.setFieldName3(crawlerDefinition.getFieldName3());
        existingCrawlerDefinition.setFieldName4(crawlerDefinition.getFieldName4());
        CrawlerDefinition updatedCrawlerDefinition = crawlerDefinitionRepository.save(existingCrawlerDefinition);
        return updatedCrawlerDefinition;
    }
    

    @Override
    public void deleteCrawlerDefinition(Long crawlerDefinitionId) {
        crawlerDefinitionRepository.deleteById(crawlerDefinitionId);
    }

    @Override
    public CrawlerDefinition setId(Long crawlerDefinitionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

}
