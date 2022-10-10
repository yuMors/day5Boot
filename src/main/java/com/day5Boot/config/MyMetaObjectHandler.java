package com.day5Boot.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 配合这个使用
     * @TableField(fill = FieldFill.INSERT)
     * @TableField(fill = FieldFill.INSERT_UPDATE)
     */

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
    LocalDateTime localDateTime = LocalDateTime.now();
    String myLocalDateTimeNow = localDateTime.format(formatter);

    /**
     * 插入元对象字段填充（用于插入时对公共字段的填充）
     *
     * @param metaObject 元对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", myLocalDateTimeNow, metaObject);
        this.setFieldValByName("updateTime", myLocalDateTimeNow, metaObject);
    }

    /**
     * 更新元对象字段填充（用于更新时对公共字段的填充）
     *
     * @param metaObject 元对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", myLocalDateTimeNow, metaObject);
    }
}
