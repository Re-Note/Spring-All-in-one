package com.group.libraryapp.domain.assignment7.fruit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Fruit {

    @Id
    private Long id = null;

    @Column(nullable = false, length = 25)
    private String name;
    private LocalDate warehousingDate;
    private long price;

    @Column(columnDefinition = "varchar(10) CHECK (status IN ('SOLD', 'NOT_SOLD'))")
    private String status;

    protected Fruit() {

    }
    public Fruit(String name, LocalDate warehousingDate, long price) {
        if(name ==null || name.isBlank()) {
            throw new IllegalArgumentException(
                    String.format("잘못된 name(%s)이 들어왔습니다, name"));
        }
        this.name = name;
        this.price = price;
    }

    public Fruit(String name, LocalDate warehousingDate, long price, String status) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String sold) {
    }
}
