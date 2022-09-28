package com.day5Boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages ={"com.day5Boot.dao"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class Day5Boot {

    public static void main(String[] args) {
        SpringApplication.run(Day5Boot.class, args);
    }

}
