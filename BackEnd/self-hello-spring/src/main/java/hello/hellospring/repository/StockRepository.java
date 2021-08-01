package hello.hellospring.repository;

import hello.hellospring.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StockRepository {
    List<Map<String, Object>> getStock();
    List<Map<String, Object>> getOneStock(Integer id);
}
