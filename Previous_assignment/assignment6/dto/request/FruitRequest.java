package com.group.libraryapp.dto.assignment7.request;

import java.time.LocalDate;

public class FruitRequest {

    private String name;
    private LocalDate warehousingDate;
    private long price;

    // 기본 생성자 추가
    public FruitRequest() {
        // 기본 생성자에서는 필드를 초기화할 필요가 없으므로 비워둡니다.
    }

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