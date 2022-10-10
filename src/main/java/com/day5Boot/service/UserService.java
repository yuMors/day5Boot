package com.day5Boot.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import com.day5Boot.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> findAllUser();

    //根据id查询用户
    List<User> findUserById(Integer id);


}
