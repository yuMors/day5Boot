package com.day5Boot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.day5Boot.controller.dto.ResponseDto;
import com.day5Boot.dao.OrdersMapper;
import com.day5Boot.domain.Orders;
import com.day5Boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Resource
    OrdersMapper ordersMapper;

    @GetMapping("/findAllOrders")
    public ResponseDto<?> findAllOrders(){
        QueryWrapper<Orders> ordersQueryWrapper = new QueryWrapper<>(new Orders());
        ordersQueryWrapper.select(tableFieldInfo -> !"name".equals(tableFieldInfo.getColumn()));
        List<Orders> ordersList = ordersMapper.selectList(ordersQueryWrapper);
        return new ResponseDto<>(true,"查询成功",ordersList);
    }

    @GetMapping("/findAll")
    public ResponseDto<?> findAllUser(){
        List<Orders> userList = ordersMapper.findAllOrders();
        return new ResponseDto<>(true,"查询成功",userList);
    }

    /**
     * 测试分页功能
     * @return
     */
    @GetMapping("/findAllPage")
    public ResponseDto<?> findAllPageOrders(){
        Page<Orders> page = new Page<>();
        page.setSize(1);
        page.setCurrent(1);
        return new ResponseDto<>(true,"查询成功",ordersMapper.findAllPageOrders(page));
    }

    @GetMapping("/testInsert")
    public ResponseDto<?> testInsert(){
        Orders orders = new Orders();
        orders.setId(7);
        orders.setPrice(230);
        return new ResponseDto<>(true,"插入成功",ordersMapper.insert(orders));
    }

    @GetMapping("/testDelete")
    public ResponseDto<?> deleteOne(){
        //Orders orders = new Orders();
        //orders.setId(4);
        return new ResponseDto<>(true,"插入成功",ordersMapper.deleteById(4));
    }

    @GetMapping("/testDelete02")
    public ResponseDto<?> deleteOne02(Integer id){
        //http://localhost:8084/orders/testDelete02?id=2
        //Orders orders = new Orders();
        //orders.setId(4);
        return new ResponseDto<>(true,"删除成功",ordersMapper.deleteById(id));
    }
}
