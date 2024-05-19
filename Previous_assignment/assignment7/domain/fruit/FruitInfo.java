package com.group.libraryapp.domain.assignment7.fruit;

import java.time.LocalDate;

public class FruitInfo {
    private String name;
    private long price;
    private LocalDate warehousingDate;

    public FruitInfo(String name, long price, LocalDate warehousingDate) {
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setWarehousingDate(LocalDate warehousingDate) {
        this.warehousingDate = warehousingDate;
    }
}
