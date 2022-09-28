package com.example.demo;

import com.day5Boot.dao.ProductMapper;
import com.day5Boot.dao.UserMapper;
import com.day5Boot.domain.Product;
import com.day5Boot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = com.day5Boot.Day5Boot.class)
class DemoApplicationTests {
    @Resource
    ProductMapper productMapper;

    @Resource
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<Product> products = productMapper.selectList(null);
        products.forEach(System.out::println);

    }



}
