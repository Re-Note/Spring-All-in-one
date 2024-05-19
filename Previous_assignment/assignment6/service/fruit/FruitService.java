package com.group.libraryapp.service.assignment7.fruit;

import com.group.libraryapp.dto.assignment7.request.FruitRequest;
import com.group.libraryapp.dto.assignment7.request.SoldRequest;
import com.group.libraryapp.dto.assignment7.response.SalesSumResponse;
import com.group.libraryapp.repository.assignment7.fruit.FruitMySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
    private final FruitMySqlRepository fruitMySqlRepository;

    @Autowired
    public FruitService(FruitMySqlRepository fruitMySqlRepository) {
        this.fruitMySqlRepository = fruitMySqlRepository;
    }

    public void addFruit(FruitRequest request){
        fruitMySqlRepository.save(request);
    }

    public void updateFruit(SoldRequest request){
        fruitMySqlRepository.update(request);
    }

    public SalesSumResponse getFruitSales(String name) {
        return fruitMySqlRepository.getFruitSalesData(name);
    }
}
