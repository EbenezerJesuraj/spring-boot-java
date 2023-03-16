import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlerDataRepository extends JpaRepository<CrawlerData, Long>{

}

public static void main(String[] args){
    
}