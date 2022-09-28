package com.day5Boot.domain;

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
public class Orders implements Serializable {
    private static final long serialVersionUID = 814668361510739929L;
    
    private Long id;
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
     */
    private LocalDateTime updateTime;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 版本
     */
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
}

