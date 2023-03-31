package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;
import com.crudapplication.entity.CrawlerDefinition;
import com.crudapplication.repository.CrawlerDefinitionPagingRepository;
import com.crudapplication.service.CrawlerDefinitionService;
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
public class CrawlerDefinitionServiceImpl implements CrawlerDefinitionService {

    private CrawlerDefinitionPagingRepository crawlerDefinitionPagingRepository;

    @Autowired
    public void CrawlerDefinitionService(CrawlerDefinitionPagingRepository crawlerDefinitionPagingRepository){
        this.crawlerDefinitionPagingRepository = crawlerDefinitionPagingRepository;
    }

    @Override
    public CrawlerDefinition createCrawlerDefinition(CrawlerDefinition crawlerDefinition) {
        System.out.println("Inside of creates CrawlerDefinition");
        return crawlerDefinitionPagingRepository.save(crawlerDefinition);
    }

    @Override
    public CrawlerDefinition getCrawlerDefinitionById(Long crawlerDefinitionId) {
        System.out.println("Inside of get CrawlerDefinition by ID");
        Optional<CrawlerDefinition> optionalCrawlerDefinition = crawlerDefinitionPagingRepository.findById(crawlerDefinitionId);
        return optionalCrawlerDefinition.get();
    }

    //@Autowired
    @Override
    public List<CrawlerDefinition> getAllCrawlerDefinition(Predicate predicate,
           Integer pageNo, Integer pageSize) {

    //public List<CrawlerDefinition> getAllCrawlerDefinition(Integer pageNo,Integer pageSize){
        
        String sortBy = "id";
        String sortDir = "ASC";

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        
        // create Pageable instance
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<CrawlerDefinition> pagedResult = crawlerDefinitionPagingRepository.findAll(predicate,pageable);
        
        
        if(pagedResult.hasContent())
            return pagedResult.getContent();
        return null;

    }
    
    // @Override
    // public void deleteCrawlerDefinition(Long CrawlerDefinitionId) {
    //     CrawlerDefinitionPagingRepository.deleteById(CrawlerDefinitionId);
    // }
 
 
   @Override
    public CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition crawlerDefinition) {
        CrawlerDefinition existingCrawlerDefinition = crawlerDefinitionPagingRepository.findById(crawlerDefinition.getId()).get();
        existingCrawlerDefinition.setSiteName((crawlerDefinition).getSiteName());
        existingCrawlerDefinition.setFieldName1(crawlerDefinition.getFieldName1());
        existingCrawlerDefinition.setFieldName2(crawlerDefinition.getFieldName2());
        existingCrawlerDefinition.setFieldName3(crawlerDefinition.getFieldName3());
        existingCrawlerDefinition.setFieldName4(crawlerDefinition.getFieldName4());
        final CrawlerDefinition updatedCrawlerDefinition = crawlerDefinitionPagingRepository.save(existingCrawlerDefinition);
        return updatedCrawlerDefinition;
    }
    
    @Override
    public CrawlerDefinition setId(Long crawlerDefinitionId) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
    
}