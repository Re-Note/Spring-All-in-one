package com.group.libraryapp.controller.assignment.totalsum;

import com.group.libraryapp.dto.assignment.request.TotalSumRequest;
import com.group.libraryapp.dto.assignment.response.TotalSumResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotalSumController {

    @PostMapping("/totalsum")
    public TotalSumResponse getTotalSum(@RequestBody TotalSumRequest request) {
        return new TotalSumResponse(request);
    }
}
