package hello.hellospring.controller;

import hello.hellospring.domain.Item;
import hello.hellospring.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class StockController {
    private StockRepository stockRepository;
    private final Item item;

    @Autowired
    StockController(StockRepository stockRepository, Item item){
        this.stockRepository = stockRepository;
        this.item = item;
    }

    @GetMapping("/api/stock")
    @CrossOrigin("*")
    @ResponseBody
    public List<Map<String, Object>> getStock(){
        return stockRepository.getStock();
    }


    @GetMapping("/api/item")
//    @PostMapping("/api/item")
    @CrossOrigin("*")
    @ResponseBody
    public List<Map<String, Object>> getOneStock(@RequestParam(value = "id", required = false) Integer id){
        Item item_ = new Item();
        item_.setID(id);
        System.out.println(item_);
        return stockRepository.getOneStock(id);
    }

}
