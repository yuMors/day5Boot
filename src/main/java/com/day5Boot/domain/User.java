package com.day5Boot.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String age;
    private String address;
}
