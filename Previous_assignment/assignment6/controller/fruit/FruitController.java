package com.group.libraryapp.controller.assignment7.fruit;

import com.group.libraryapp.dto.assignment7.request.FruitRequest;
import com.group.libraryapp.dto.assignment7.request.SoldRequest;
import com.group.libraryapp.dto.assignment7.response.SalesSumResponse;
import com.group.libraryapp.service.assignment7.fruit.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController {
    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void addFruit(@RequestBody FruitRequest request) {
        fruitService.addFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruit(@RequestBody SoldRequest request) {
        fruitService.updateFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public SalesSumResponse getFruitStats(@RequestParam String name) {
        return fruitService.getFruitSales(name);
    }
}
