package com.group.libraryapp.dto.assignment2.response;

public class SalesSumResponse {

    private long salesAmount;
    private long notSalesAmount;

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