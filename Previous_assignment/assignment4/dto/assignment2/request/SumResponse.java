package com.group.libraryapp.dto.assignment2.request;

public class SumResponse {
    private long price;
    private boolean status;

    public SumResponse(long price, boolean status) {
        this.price = price;
        this.status = status;
    }

    public long getPrice() {
        return price;
    }

    public boolean status() {
        return status;
    }
}
