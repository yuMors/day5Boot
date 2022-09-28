package com.day5Boot.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.day5Boot.domain.Orders;
import org.springframework.stereotype.Repository;

/**
* @author 30676
* @description 针对表【orders】的数据库操作Mapper
* @createDate 2022-09-28 15:30:00
* @Entity generator.domain.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {
}
