package com.group.libraryapp.dto.assignment7.response;

public class SalesSumResponse {

    private final long salesAmount;
    private final long notSalesAmount;

    public SalesSumResponse(long salesAmount, long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public long getNotSalesAmount() {
        return notSalesAmount;
    }
}