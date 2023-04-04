package com.crudapplication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crudapplication.entity.CrawlerData;

public interface CrawlerDataPagingRepository extends PagingAndSortingRepository<CrawlerData, Integer> {

    /*
    Page<CrawlerData> findAll(Predicate<CrawlerData> predicate, Pageable pageable) {
        String sortBy = "id";
        String sortDir = "ASC";

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        
        // create Pageable instance
        Pageable pageable =  PageRequest.of(pageNo, pageSize, sort);
        Page<CrawlerData> page = crawlerDataPagingRepository.findAll(pageable); // This line has issues
        //Page<CrawlerData> page = crawlerDataPagingRepository.findAll(pageable); // This line has issues
        //List<CrawlerData> crawlerData = crawlerDataService.getAllCrawlerData(predicate,pageNo, pageSize);

        //HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "crawlerdata");
        return new ResponseEntity<>(page.getContent(), HttpStatus.OK);
    }
    */

}