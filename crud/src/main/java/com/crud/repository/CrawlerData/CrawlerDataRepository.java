import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.springboot.entity.CrawlerData;

@Repository
public interface CrawlerDataRepository extends JpaRepository<CrawlerData, Long>{

}
