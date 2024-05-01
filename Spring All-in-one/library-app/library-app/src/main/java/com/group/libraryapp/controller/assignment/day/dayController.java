package com.group.libraryapp.controller.assignment.day;

import com.group.libraryapp.dto.assignment.response.DayOfTheWeekResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class dayController {

    @GetMapping("/api/v1/day-of-the-week")
    public DayOfTheWeekResponse getDayOfWeek(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return new DayOfTheWeekResponse(date);
    }
}
