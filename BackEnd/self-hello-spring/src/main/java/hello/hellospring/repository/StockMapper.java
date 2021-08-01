package hello.hellospring.repository;

import hello.hellospring.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StockMapper {
    List<Map<String, Object>> getStock();
    List<Map<String, Object>> getOneStock(Integer ID);
}
