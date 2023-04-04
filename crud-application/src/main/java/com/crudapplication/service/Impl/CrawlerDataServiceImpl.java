package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;

import com.crudapplication.controller.CrawlerDataController;
import com.crudapplication.entity.CrawlerData;
import com.crudapplication.repository.CrawlerDataRepository;
import com.crudapplication.service.CrawlerDataService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDataServiceImpl implements CrawlerDataService {

    private CrawlerDataRepository CrawlerDataRepository;

    @Override
    public CrawlerData createCrawlerData(CrawlerData CrawlerData) {
        System.out.println("Inside of creates CrawlerData");
        return CrawlerDataRepository.save(CrawlerData);
    }

    @Override
    public CrawlerData getCrawlerDataById(Long CrawlerDataId) {
        System.out.println("Inside of get CrawlerData by ID");
        Optional<CrawlerData> optionalCrawlerData = CrawlerDataRepository.findById(CrawlerDataId);
        return optionalCrawlerData.get();
    }

    @Override
    public List<CrawlerData> getAllCrawlerDatas() {
        return CrawlerDataRepository.findAll();
    }

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

    @Override
    public CrawlerData setId(Long CrawlerDataId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    @Override
    public CrawlerDataController updateCrawlerData(CrawlerDataController crawlerData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCrawlerData'");
    }
}
