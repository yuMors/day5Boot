package com.day5Boot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.day5Boot.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductMapper extends BaseMapper<Product> {
}
