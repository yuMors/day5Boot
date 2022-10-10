package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.day5Boot.dao.OrdersMapper;
import com.day5Boot.dao.ProductMapper;
import com.day5Boot.dao.UserMapper;
import com.day5Boot.domain.Orders;
import com.day5Boot.domain.Product;
import com.day5Boot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Predicate;

@SpringBootTest(classes = com.day5Boot.Day5Boot.class)
class DemoApplicationTests {
    @Resource
    ProductMapper productMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    OrdersMapper ordersMapper;

    @Test
    public void contextLoads() {
        List<Product> products = productMapper.selectList(null);
        products.forEach(System.out::println);

    }
    @Test
    public void test03(){
        Orders orders = new Orders();
        orders.setPrice(6000);
        orders.setId(1);
        orders.setVersion(1);
        //ordersMapper.update(orders, null);
        //ordersMapper.insert(orders);
        ordersMapper.updateById(orders);
    }

    @Test
    public void test04(){
        ordersMapper.deleteById(5);
    }

    @Test
    public void test05(){
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>(new Orders());
        queryWrapper.select(tableFieldInfo -> !"name".equals(tableFieldInfo.getColumn()));
        ordersMapper.selectList(queryWrapper);
    }

    @Test
    public void test06(){
        Orders orders = new Orders();
        orders.setPrice(7000);
        orders.setId(3);
        orders.setVersion(2);
        ordersMapper.updateById(orders);
    }

    @Test
    public void test07(){
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>(new Orders());
        queryWrapper.select(tableFieldInfo -> !"name".equals(tableFieldInfo.getColumn()));
        queryWrapper.eq("id",3);
        Orders orders = ordersMapper.selectOne(queryWrapper);
        orders.setPrice(8000);
        ordersMapper.updateById(orders);
    }
}
