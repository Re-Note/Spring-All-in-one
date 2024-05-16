package com.group.libraryapp.service.assignment6.fruit;

import com.group.libraryapp.dto.assignment6.request.FruitRequest;
import com.group.libraryapp.dto.assignment6.request.SoldRequest;
import com.group.libraryapp.dto.assignment6.response.SalesSumResponse;
import com.group.libraryapp.repository.assignment6.fruit.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    @Autowired
    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public void addFruit(FruitRequest request){
        fruitRepository.save(request);
    }

    public void updateFruit(SoldRequest request){
        fruitRepository.update(request);
    }

    public SalesSumResponse getFruitSales(String name) {
        return fruitRepository.getFruitSalesData(name);
    }
}
