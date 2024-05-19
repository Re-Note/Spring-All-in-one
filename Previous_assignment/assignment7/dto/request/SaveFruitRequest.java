package com.group.libraryapp.dto.assignment7.request;

import java.time.LocalDate;

public class SaveFruitRequest {
    private String name;
    private LocalDate warehousingDate;
    private long price;
    private String status;

    public SaveFruitRequest(String name, LocalDate warehousingDate, long price, String status) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWarehousingDate(LocalDate warehousingDate) {
        this.warehousingDate = warehousingDate;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}