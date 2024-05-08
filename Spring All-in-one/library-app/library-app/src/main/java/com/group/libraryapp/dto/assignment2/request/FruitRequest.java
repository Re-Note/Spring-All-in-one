package com.group.libraryapp.dto.assignment2.request;

import java.time.LocalDate;

public class FruitRequest {

    private String name;
    private LocalDate warehousingDate;
    private long price;

    public FruitRequest(String name, LocalDate warehousingDate, long price) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }
}