package com.group.libraryapp.controller.assingment2.fruit;

import com.group.libraryapp.dto.assignment2.request.FruitRequest;
import com.group.libraryapp.dto.assignment2.request.SoldRequest;
import com.group.libraryapp.dto.assignment2.request.SumResponse;
import com.group.libraryapp.dto.assignment2.response.SalesSumResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class FruitController {

    private final JdbcTemplate jdbcTemplate;

    public FruitController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruit(@RequestBody FruitRequest request) {
        String sql = "INSERT INTO fruit (name, warehousingDate, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruit(@RequestBody SoldRequest request) {
        String readSql = "SELECT * FROM fruit WHERE id = ?";

        boolean isFruitNotExist = jdbcTemplate.query(readSql, (rs, rowNum) -> 0, request.getId()).isEmpty();
        if (isFruitNotExist) {
            throw new IllegalArgumentException();
        }

        String updateSql = "UPDATE fruit SET status  = true WHERE id = ?";
        jdbcTemplate.update(updateSql, request.getId());
    }

    @GetMapping("/api/v1/fruit/stat")
    public SalesSumResponse getAmountInfo(@RequestParam String name) {
        String sql = "SELECT * FROM fruit WHERE name = ?";
        List<SumResponse> list = jdbcTemplate.query(sql, (rs, rowNum) ->
                new SumResponse(rs.getLong("price"), rs.getBoolean("status")), name);

        long salesAmount = list.stream()
                .filter(SumResponse::status)
                .mapToLong(SumResponse::getPrice)
                .sum();

        long notSalesAmount = list.stream()
                .filter(res -> !res.status())
                .mapToLong(SumResponse::getPrice)
                .sum();

        return new SalesSumResponse(salesAmount, notSalesAmount);
    }

//    @GetMapping("/api/v1/fruit/stat")
//    public SalesSumResponse statFruit(@RequestParam String name) {
//
//        String salesSql = "SELECT sum(price) FROM fruit WHERE status = true GROUP BY name HAVING name = ?";
//        String notSalesSql = "SELECT sum(price) FROM fruit WHERE status = false GROUP BY name HAVING name = ?";
//
//
//        long salesAmount = jdbcTemplate.queryForObject(salesSql, long.class, name);
//        long notSalesAmount = jdbcTemplate.queryForObject(notSalesSql, long.class, name);
//
//
//        return new SalesSumResponse(salesAmount, notSalesAmount);
//    }
}