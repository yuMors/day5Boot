package com.day5Boot.service.impl;

import com.day5Boot.dao.UserMapper;
import com.day5Boot.domain.User;
import com.day5Boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findMyUser();
    }

    @Override
    public List<User> findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
