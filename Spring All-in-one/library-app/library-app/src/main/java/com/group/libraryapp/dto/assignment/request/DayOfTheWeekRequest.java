package com.group.libraryapp.dto.assignment.request;

import java.time.LocalDate;

public class DayOfTheWeekRequest {

    private LocalDate date;

    public DayOfTheWeekRequest(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
