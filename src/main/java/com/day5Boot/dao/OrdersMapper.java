package com.day5Boot.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.day5Boot.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Makos
* @description 针对表【orders】的数据库操作Mapper
* @createDate 2022-09-28 15:30:00
* @Entity generator.domain.Orders
*/
public interface OrdersMapper extends BaseMapper<Orders> {
    /**
     * 查询所有
     * @return
     */
    List<Orders> findAllOrders();
    /**
     * 分页-查询所有
     * @return
     */
    IPage<Orders> findAllPageOrders(Page<Orders> page);
}
