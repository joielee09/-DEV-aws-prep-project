package hello.hellospring.service;

import hello.hellospring.domain.Item;
import hello.hellospring.repository.StockMapper;
import hello.hellospring.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StockServiceImplement implements StockRepository {

    private StockMapper stockMapper;
    private Item item;

    @Autowired
    StockServiceImplement(StockMapper stockMapper){
        this.stockMapper = stockMapper;
    }

    public List<Map<String, Object>> getStock() {
        return stockMapper.getStock();
    }

    public List<Map<String, Object>> getOneStock(Integer id) {
        return stockMapper.getOneStock(id);
    }

}
