package com.group.libraryapp.repository.assignment6.fruit;

import com.group.libraryapp.dto.assignment6.request.FruitRequest;
import com.group.libraryapp.dto.assignment6.request.SoldRequest;
import com.group.libraryapp.dto.assignment6.response.SalesSumResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FruitRepository {

    private final JdbcTemplate jdbcTemplate;

    public FruitRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(FruitRequest request) {
        String sql = "INSERT INTO Fruits(name, warehousingDate, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    public void update(SoldRequest request) {
        String sql = "UPDATE Fruits SET status = false WHERE id = ?";
        jdbcTemplate.update(sql, request.getId());
    }

    public SalesSumResponse getFruitSalesData(String name) {
        String salesAmountSql = "SELECT COALESCE(SUM(price), 0) FROM Fruits WHERE name = ? AND status = true";
        Long salesAmount = jdbcTemplate.queryForObject(salesAmountSql, new Object[]{name}, Long.class);

        String notSalesAmountSql = "SELECT COALESCE(SUM(price), 0) FROM Fruits WHERE name = ? AND status = false";
        Long notSalesAmount = jdbcTemplate.queryForObject(notSalesAmountSql, new Object[]{name}, Long.class);

        return new SalesSumResponse(salesAmount, notSalesAmount);
    }
}
