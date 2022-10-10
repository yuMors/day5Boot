package com.day5Boot.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.day5Boot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> findMyUser();

    List<User> findUserById(Integer id);

    //#{ew.xxx}
    User findUserByWrapper(@Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
