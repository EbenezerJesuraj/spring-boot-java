package com.crud.service;

import lombok.AllArgsConstructor;
import com.crud.service.CrawlerDefinitionService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDefinitionServiceImpl<CrawlerDefinitionRepository> implements CrawlerDefinitionService {

    private CrawlerDefinitionRepository CrawlerDefinitionRepository;

    @Override
    public CrawlerDefinition createCrawlerDefinition(CrawlerDefinition CrawlerDefinition) {
        return CrawlerDefinitionRepository.save(CrawlerDefinition);
    }

    @Override
    public CrawlerDefinition getCrawlerDefinitionById(Long CrawlerId) {
        Optional<CrawlerDefinition> optionalCrawlerDefinition = CrawlerDefinitionRepository.findById(CrawlerId);
        return optionalCrawlerDefinition.get();
    }

    @Override
    public List<CrawlerDefinition> getAllCrawlerDefinitions() {
        return CrawlerDefinitionRepository.findAll();
    }

// update func needs to be rewritten for a custom data-set
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
}