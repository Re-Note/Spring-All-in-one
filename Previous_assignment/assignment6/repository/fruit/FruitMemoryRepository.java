package com.group.libraryapp.repository.assignment7.fruit;

import com.group.libraryapp.dto.assignment7.request.FruitRequest;
import com.group.libraryapp.dto.assignment7.request.SoldRequest;
import com.group.libraryapp.dto.assignment7.response.SalesSumResponse;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FruitMemoryRepository {

    private final Map<Integer, Fruit> fruitMap = new HashMap<>();
    private int idCounter = 0;

    public void save(FruitRequest request) {
        int id = ++idCounter;
        Fruit fruit = new Fruit(id, request.getName(), request.getWarehousingDate(), request.getPrice(), true);
        fruitMap.put(id, fruit);
    }

    public void update(SoldRequest request) {
        Fruit fruit = fruitMap.get(request.getId());
        if (fruit != null) {
            fruit.setStatus(false);
        }
    }

    public SalesSumResponse getFruitSalesData(String name) {
        long salesAmount = 0;
        long notSalesAmount = 0;

        for (Fruit fruit : fruitMap.values()) {
            if (fruit.getName().equals(name)) {
                if (fruit.isStatus()) {
                    salesAmount += fruit.getPrice();
                } else {
                    notSalesAmount += fruit.getPrice();
                }
            }
        }

        return new SalesSumResponse(salesAmount, notSalesAmount);
    }

    // Inner class representing a fruit
    private static class Fruit {
        private final int id;
        private final String name;
        private final String warehousingDate;
        private final long price;
        private boolean status;

        public Fruit(int id, String name, LocalDate warehousingDate, long price, boolean status) {
            this.id = id;
            this.name = name;
            this.warehousingDate = String.valueOf(warehousingDate);
            this.price = price;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getWarehousingDate() {
            return warehousingDate;
        }

        public long getPrice() {
            return price;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }
}
