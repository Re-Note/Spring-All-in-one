package com.group.libraryapp.dto.assignment.response;

import java.time.LocalDate;

public class DayOfTheWeekResponse {
    private String dayOfTheWeek;

    public DayOfTheWeekResponse(LocalDate date) {
        this.dayOfTheWeek = date.getDayOfWeek().toString();
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek.substring(0, 3);
    }
}
