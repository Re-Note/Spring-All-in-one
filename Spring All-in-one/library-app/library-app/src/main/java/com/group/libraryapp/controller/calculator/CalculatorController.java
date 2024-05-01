package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// ctrl + alt + o import 문 정리

@RestController // 아래 클래스를 API의 진입 지점으로 만들어주는 것
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers( CalculatorAddRequest request ) {
        return request.getNumber1() + request.getNumber2();
    }
}
