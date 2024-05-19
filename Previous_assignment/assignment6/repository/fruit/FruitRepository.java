package com.group.libraryapp.repository.assignment7.fruit;

import com.group.libraryapp.dto.assignment7.request.FruitRequest;
import com.group.libraryapp.dto.assignment7.request.SoldRequest;
import com.group.libraryapp.dto.assignment7.response.SalesSumResponse;

public interface FruitRepository {
    void save(FruitRequest request);
    void update(SoldRequest request);

    SalesSumResponse getFruitSalesData(String name);
}
