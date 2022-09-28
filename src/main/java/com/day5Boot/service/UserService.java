package com.day5Boot.service;

import com.day5Boot.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    //根据id查询用户
    List<User> findUserById(Integer id);
}
