package com.day5Boot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.day5Boot.controller.dto.ResponseDto;
import com.day5Boot.dao.UserMapper;
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

    @Resource
    UserMapper userMapper;

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

    /**
     * query wrapper条件构造器
     */
    @GetMapping("/findWrapper")
    public ResponseDto<?> findUserByWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 2);
        User user = userMapper.findUserByWrapper(wrapper);
        return new ResponseDto<>(true,null,user);
    }

    /*@GetMapping("/findPage")
    public ResponseDto<?> findAllUserPage(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        IPage<User> page = new Page<>();
        page.setSize(2);
        page.setCurrent(1);
        IPage<User> userIPage = userMapper.selectPage(page, wrapper);
        //List<User> users = userMapper.selectList(wrapper);
        System.err.println(userIPage);
        System.out.println(page.getRecords());//获取当前页的数据
        System.out.println(page.getTotal());//获取总记录数
        System.out.println(page.getCurrent());//当前页码
        return new ResponseDto<>(true,null,userIPage);
    }*/

    /**
     * 测试mybatis-plus与service层的结合实现
     * @return
     */
    @GetMapping("/findAllUserService")
    public ResponseDto<?> findAllUserTestService(){
        List<User> userList = userService.list();
        return new ResponseDto<>(true,"查询成功",userList);
    }
}
