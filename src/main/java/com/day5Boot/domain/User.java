package com.day5Boot.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String name;
    // private String password;
    // private String age;
    // private String address;
    private String sex;
    private String college;
    //private LocalDateTime time;
    private String time;
}
