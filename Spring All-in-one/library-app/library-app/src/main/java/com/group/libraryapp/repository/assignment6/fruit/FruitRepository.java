package com.group.libraryapp.repository.assignment6.fruit;

import com.group.libraryapp.dto.assignment6.request.FruitRequest;
import com.group.libraryapp.dto.assignment6.request.SoldRequest;
import com.group.libraryapp.dto.assignment6.response.SalesSumResponse;

public interface FruitRepository {
    void save(FruitRequest request);
    void update(SoldRequest request);

    SalesSumResponse getFruitSalesData(String name);
}
