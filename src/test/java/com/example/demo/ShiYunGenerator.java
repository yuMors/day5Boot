package com.example.demo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

/**
 * 基于mybatis-plus的代码生成器
 * 适合放在test中 不碍事
 * 需要三个插件 似乎只用用于或基于springboot
 * 使用注意事项: 注意修改一下数据库 输出目录即可 多表的话用,连接
 * TODO: 详细配置说明看官方文档 挺简单的
 * : mysqlUrl 配置数据库
 * : outputFileSy 配置输出位置
 * : databaseTable 设置需要生成的表名
 */
public class ShiYunGenerator {
    // 配置输出位置 最后一个/是用来连接下面的包
    final String outputFileSy = "C://Users/30676/Desktop/day5/day5Boot/src/main/java/com/day5Boot/";
    // 设置需要生成的表名
    final String databaseTable = "tbl_user";
    @Test
    public void generator() {
        // 配置数据库
        String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/crm2008";
        FastAutoGenerator.create(mysqlUrl, "root", "root")
                .globalConfig(builder -> {
                    builder.author("Makos") // 设置作者
                            //.enableSwagger() // 开启swagger模式 一些文档注解
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir()//不打开输出目录
                            .outputDir(outputFileSy); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("generator")//设置输出包名
                            .entity("domain");// 设置实体类包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude(databaseTable)// 设置需要生成的表名
                            .addTablePrefix("tbl_")// 设置过滤表前缀
                            .entityBuilder()//开启实体类控制
                            .enableLombok()//启用Lombok注解开发
                            .controllerBuilder()
                            .enableRestStyle();//开启Rest风格的controller

                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}