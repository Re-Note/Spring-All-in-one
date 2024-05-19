package com.group.libraryapp.dto.assignment7.response;

public class GetFruitStatResponse {
    private long salesAmount;
    private long notSalesAmount;

    public GetFruitStatResponse(long salesAmount, long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public long getNotSalesAmount() {
        return notSalesAmount;
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }

    public void setNotSalesAmount(long notSalesAmount) {
        this.notSalesAmount = notSalesAmount;
    }
}
