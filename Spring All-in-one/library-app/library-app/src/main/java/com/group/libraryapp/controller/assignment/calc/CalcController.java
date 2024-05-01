package com.group.libraryapp.controller.assignment.calc;

import com.group.libraryapp.dto.assignment.request.CalculatorCalcRequest;
import com.group.libraryapp.dto.assignment.response.CalculatorCalcResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/api/v1/calc")
    public CalculatorCalcResponse calcTwoNumbers(CalculatorCalcRequest request ) {
        return new CalculatorCalcResponse(request);
    }
}
