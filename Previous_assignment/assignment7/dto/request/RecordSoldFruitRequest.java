package com.group.libraryapp.dto.assignment7.request;

public class RecordSoldFruitRequest {
    private long id;

    public RecordSoldFruitRequest() {
    }

    public RecordSoldFruitRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

