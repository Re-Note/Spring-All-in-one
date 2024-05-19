package com.group.libraryapp.repository.assignment7.fruit;

import com.group.libraryapp.dto.assignment7.request.SaveFruitRequest;
import com.group.libraryapp.dto.assignment7.request.RecordSoldFruitRequest;
import com.group.libraryapp.dto.assignment7.response.GetFruitStatResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FruitMySqlRepository {

    private final JdbcTemplate jdbcTemplate;

    public FruitMySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(SaveFruitRequest request) {
        String sql = "INSERT INTO Fruits(name, warehousingDate, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    public void update(RecordSoldFruitRequest request) {
        String sql = "UPDATE Fruits SET status = false WHERE id = ?";
        jdbcTemplate.update(sql, request.getId());
    }

    public GetFruitStatResponse getFruitSalesData(String name) {
        String salesAmountSql = "SELECT COALESCE(SUM(price), 0) FROM Fruits WHERE name = ? AND status = true";
        Long salesAmount = jdbcTemplate.queryForObject(salesAmountSql, new Object[]{name}, Long.class);

        String notSalesAmountSql = "SELECT COALESCE(SUM(price), 0) FROM Fruits WHERE name = ? AND status = false";
        Long notSalesAmount = jdbcTemplate.queryForObject(notSalesAmountSql, new Object[]{name}, Long.class);

        return new GetFruitStatResponse(salesAmount, notSalesAmount);
    }
}
