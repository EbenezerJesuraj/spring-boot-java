

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlerDefinitionRepository extends JpaRepository<CrawlerDefinition, Long>{

}

public static void main(String[] args){
    
}
// Inversion of Control and Dependency Injection