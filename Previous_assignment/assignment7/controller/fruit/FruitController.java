package com.group.libraryapp.controller.assignment7.fruit;

import com.group.libraryapp.domain.assignment7.fruit.FruitInfo;
import com.group.libraryapp.dto.assignment7.request.SaveFruitRequest;
import com.group.libraryapp.dto.assignment7.request.RecordSoldFruitRequest;
import com.group.libraryapp.dto.assignment7.response.CountFruitResponse;
import com.group.libraryapp.dto.assignment7.response.GetFruitStatResponse;
import com.group.libraryapp.service.assignment7.fruit.FruitServiceV2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {

    private final FruitServiceV2 fruitService;

    public FruitController(FruitServiceV2 fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public SaveFruitRequest saveFruit(@RequestBody SaveFruitRequest request) {
        return fruitService.saveFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public ResponseEntity<Void> recordSoldFruit(@RequestBody RecordSoldFruitRequest request){
        return fruitService.recordSoldFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public GetFruitStatResponse getFruitStat(@RequestParam String name) {
        return fruitService.getFruitStat(name);
    }

    @GetMapping("/api/v1/fruit/count")
    public CountFruitResponse countFruit(@RequestParam String name) {
        return fruitService.countFruit(name);
    }

    @GetMapping("/api/v1/fruit/list")
    public List<FruitInfo> getFruitList(@RequestParam String option, @RequestParam long price) {
        return fruitService.getFruitList(option, price);
    }
}