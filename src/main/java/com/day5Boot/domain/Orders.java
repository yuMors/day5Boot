package com.day5Boot.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2022-09-28 15:35:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    //private static final long serialVersionUID = 814668361510739929L;
    //
    private Integer id;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 备注
     */
    private String remark;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 更新时间
     * 执行插入 更新操作都会调用
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateTime;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private String createTime;
    /**
     * 版本
     */
    @Version
    private Integer version;
    /**
     * 删除逻辑标识，0-未删除，1-已删除
     */
    private Integer delFlag;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 加入用户表的name列
     */
    private String name;
}

