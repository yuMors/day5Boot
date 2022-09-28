package com.day5Boot.controller;

import com.day5Boot.controller.dto.ResponseDto;
import com.day5Boot.domain.User;
import com.day5Boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public ResponseDto<?> findAllUser(){
        List<User> userList = userService.findAllUser();
        return new ResponseDto<>(true,"查询成功",userList);
    }

    /**
     * 根据id查询
     * @return
     */
    @GetMapping("/findOne")
    public ResponseDto<?> findUserById(Integer id){
        List<User> userList = userService.findUserById(id);
        return new ResponseDto<>(true,"查询成功",userList);
    }
}
