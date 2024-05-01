package com.group.libraryapp.dto.assignment.response;

import com.group.libraryapp.dto.assignment.request.CalculatorCalcRequest;

public class CalculatorCalcResponse {
    private int add;
    private int minus;
    private int multiply;

    public CalculatorCalcResponse(CalculatorCalcRequest num) {
        this.add = num.getNum1() + num.getNum2();
        this.minus = num.getNum1() - num.getNum2();
        this.multiply = num.getNum1() * num.getNum2();
    }

    public int getAdd() {
        return add;
    }

    public int getMinus() {
        return minus;
    }

    public int getMultiply() {
        return multiply;
    }
}
