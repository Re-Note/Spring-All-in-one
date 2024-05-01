package com.group.libraryapp.dto.assignment.response;

import com.group.libraryapp.dto.assignment.request.TotalSumRequest;

public class TotalSumResponse {

    private int sum;

    public int getSum() {
        return sum;
    }

    public TotalSumResponse(TotalSumRequest request) {
        this.sum = request.getNumbers().stream().mapToInt(Integer::intValue).sum();
    }
}