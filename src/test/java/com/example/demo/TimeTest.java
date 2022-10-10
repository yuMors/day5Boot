package com.example.demo;

import com.day5Boot.dao.OrdersMapper;
import com.day5Boot.domain.Orders;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {

    @Resource
    OrdersMapper ordersMapper;

    @Test
    public void test01(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String myLocalDateTime = localDateTime.format(myFormatter);
        System.out.println(myLocalDateTime);
    }

    @Test
    public void test02(){
        Orders orders = new Orders();
        orders.setPrice(123);
        orders.setId(4);
        //ordersMapper.update(orders, null);
        ordersMapper.insert(orders);
    }
}
