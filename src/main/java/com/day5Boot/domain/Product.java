package com.day5Boot.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *product 产品
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("product")
public class Product {
    private Integer id;
    private String productNum;
    private String productName;
    private String cityName;
    /**
     * 如果用Date（java工具类）类型 与数据库的datetime格式不一致，容易出问题，
     * 精度比数据库的datetime还高 Wed May 18 21:24:40 CST 2016
     * Date（java工具类）类型 是英文状态下的高精度时间 好像还有时区什么的
     * Date（java数据库类）类型 只有年-月-日
     */
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private String departureTime;
    private Double productPrice;
    private String productDesc;
    private Integer productStatus;
}
