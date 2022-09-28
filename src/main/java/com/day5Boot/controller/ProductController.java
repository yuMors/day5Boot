package com.day5Boot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.day5Boot.controller.dto.ResponseDto;
import com.day5Boot.dao.ProductMapper;
import com.day5Boot.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/list")
    public ResponseDto<?> listProduct(){
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        List<Product> products = productMapper.selectList(queryWrapper);
        return new ResponseDto<>(true,null, products);
    }



    /**
     * 添加
     * @return
     */
    @PostMapping("add")
    public ResponseDto<?> addProduct(Product product){
        productMapper.insert(product);
        return new ResponseDto<>(true,null,"添加成功");
    }

    /**
     * 删除
     * @return
     */
    @PostMapping("delete")
    public ResponseDto<?> deleteProduct(){
        return new ResponseDto<>(true,null,null);
    }

    /**
     * 修改
     * @return
     */
    @PutMapping("put")
    public ResponseDto<?> putProduct(){
        return new ResponseDto<>(true,null,null);
    }

}
