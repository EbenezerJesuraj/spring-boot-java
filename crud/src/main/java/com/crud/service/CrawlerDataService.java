package net.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.springboot.entity.CrawlerData;
import net.springboot.repository.CrawlerDataRepository;
import net.springboot.service.CrawlerDataService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDataServiceImpl implements CrawlerDataService {

    private CrawlerDataRepository CrawlerDataRepository;

    @Override
    public CrawlerData createCrawlerData(CrawlerData CrawlerData) {
        return CrawlerDataRepository.save(CrawlerData);
    }

    @Override
    public CrawlerData getCrawlerDataById(Long CrawlerId) {
        Optional<CrawlerData> optionalCrawlerData = CrawlerDataRepository.findById(CrawlerId);
        return optionalCrawlerData.get();
    }

    @Override
    public List<CrawlerData> getAllCrawlerDatas() {
        return CrawlerDataRepository.findAll();
    }

// update func needs to be rewritten for a custom data-set
    @Override
    public CrawlerData updateCrawlerData(CrawlerData CrawlerData) {
        CrawlerData existingCrawlerData = CrawlerDataRepository.findById(CrawlerData.getId()).get();
        existingCrawlerData.setFirstName(CrawlerData.getFirstName());
        existingCrawlerData.setLastName(CrawlerData.getLastName());
        existingCrawlerData.setEmail(CrawlerData.getEmail());
        CrawlerData updatedCrawlerData = CrawlerDataRepository.save(existingCrawlerData);
        return updatedCrawlerData;
    }

    @Override
    public void deleteCrawlerData(Long CrawlerDataId) {
        CrawlerDataRepository.deleteById(CrawlerDataId);
    }
}