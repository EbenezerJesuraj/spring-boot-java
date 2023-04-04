package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;

import com.crudapplication.controller.CrawlerDefinitionController;
import com.crudapplication.entity.CrawlerDefinition;
import com.crudapplication.repository.*;
import com.crudapplication.service.CrawlerDefinitionService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDefinitionServiceImpl implements CrawlerDefinitionService {

    private CrawlerDefinition CrawlerDefinitionRepository;

    @Override
    public CrawlerDefinition createCrawlerDefinition(CrawlerDefinition CrawlerDefinition) {
        System.out.println("Inside of creates CrawlerDefinition");
        return CrawlerDefinitionRepository.save(CrawlerDefinition);
    }

    @Override
    public CrawlerDefinition getCrawlerDefinitionById(Long CrawlerDefinitionId) {
        System.out.println("Inside of get CrawlerDefinition by ID");
        Optional<CrawlerDefinition> optionalCrawlerDefinition = CrawlerDefinitionRepository.findById(CrawlerDefinitionId);
        return optionalCrawlerDefinition.get();
    }

    @Override
    public List<CrawlerDefinition> getAllCrawlerDefinitions() {
        return CrawlerDefinitionRepository.findAll();
    }

    @Override
    public CrawlerDefinition updateCrawlerDefinition(CrawlerDefinition CrawlerDefinition) {
        CrawlerDefinition existingCrawlerDefinition = CrawlerDefinitionRepository.findById(CrawlerDefinition.getId()).get();
        existingCrawlerDefinition.setFirstName(CrawlerDefinition.getFirstName());
        existingCrawlerDefinition.setLastName(CrawlerDefinition.getLastName());
        existingCrawlerDefinition.setEmail(CrawlerDefinition.getEmail());
        CrawlerDefinition updatedCrawlerDefinition = CrawlerDefinitionRepository.save(existingCrawlerDefinition);
        return updatedCrawlerDefinition;
    }

    @Override
    public void deleteCrawlerDefinition(Long CrawlerDefinitionId) {
        CrawlerDefinitionRepository.deleteById(CrawlerDefinitionId);
    }

    @Override
    public CrawlerDefinition setId(Long CrawlerDefinitionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    @Override
    public CrawlerDefinitionController updateCrawlerDefinition(CrawlerDefinitionController CrawlerDefinition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCrawlerDefinition'");
    }
}
