ackage net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.CrawlerDefinition;
import net.javaguides.springboot.service.CrawlerDefinitionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/CrawlerDefinitions")
public class CrawlerDefinitionController {

    private CrawlerDefinitionService CrawlerDefinitionService;

    // build create CrawlerDefinition REST API
    @PostMapping
    public ResponseEntity<CrawlerDefinition> createCrawlerDefinition(@RequestBody CrawlerDefinition CrawlerDefinition){
        CrawlerDefinition savedCrawlerDefinition = CrawlerDefinitionService.createCrawlerDefinition(CrawlerDefinition);
        return new ResponseEntity<>(savedCrawlerDefinition, HttpStatus.CREATED);
    }

    // build get CrawlerDefinition by id REST API
    // http://localhost:8080/api/CrawlerDefinitions/1
    @GetMapping("{id}")
    public ResponseEntity<CrawlerDefinition> getCrawlerDefinitionById(@PathVariable("id") Long CrawlerDefinitionId){
        CrawlerDefinition CrawlerDefinition = CrawlerDefinitionService.getCrawlerDefinitionById(CrawlerDefinitionId);
        return new ResponseEntity<>(CrawlerDefinition, HttpStatus.OK);
    }

    // Build Get All CrawlerDefinitions REST API
    // http://localhost:8080/api/CrawlerDefinitions
    @GetMapping
    public ResponseEntity<List<CrawlerDefinition>> getAllCrawlerDefinitions(){
        List<CrawlerDefinition> CrawlerDefinitions = CrawlerDefinitionService.getAllCrawlerDefinitions();
        return new ResponseEntity<>(CrawlerDefinitions, HttpStatus.OK);
    }

    // Build Update CrawlerDefinition REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/CrawlerDefinitions/1
    public ResponseEntity<CrawlerDefinition> updateCrawlerDefinition(@PathVariable("id") Long CrawlerDefinitionId,
                                           @RequestBody CrawlerDefinition CrawlerDefinition){
        CrawlerDefinition.setId(CrawlerDefinitionId);
        CrawlerDefinition updatedCrawlerDefinition = CrawlerDefinitionService.updateCrawlerDefinition(CrawlerDefinition);
        return new ResponseEntity<>(updatedCrawlerDefinition, HttpStatus.OK);
    }

    // Build Delete CrawlerDefinition REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCrawlerDefinition(@PathVariable("id") Long CrawlerDefinitionId){
        CrawlerDefinitionService.deleteCrawlerDefinition(CrawlerDefinitionId);
        return new ResponseEntity<>("CrawlerDefinition successfully deleted!", HttpStatus.OK);
    }
}