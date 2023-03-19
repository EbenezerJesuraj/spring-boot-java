import net.springboot.entity.CrawlerDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlerDefinitionRepository extends JpaRepository<CrawlerDefinition, Long>{

}

// Inversion of Control and Dependency Injection