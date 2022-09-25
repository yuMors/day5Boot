package com.day5Boot.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestParam {
    public Integer pageNum;
    public Integer pageSize;
    public String keyword;
}
