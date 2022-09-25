package com.day5Boot.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回信息状态类
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto <T>{
    private Boolean Success;
    private String Message;
    T data;
}
