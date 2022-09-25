package com.day5Boot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.day5Boot.controller.dto.ResponseDto;
import com.day5Boot.dao.ProductMapper;
import com.day5Boot.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/day5")
public class ProductController {
    @Resource
    private ProductMapper productMapper;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/list")
    public ResponseDto<?> list(){
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        List<Product> products = productMapper.selectList(queryWrapper);
        return new ResponseDto<>(true,null,products);
    }
}
