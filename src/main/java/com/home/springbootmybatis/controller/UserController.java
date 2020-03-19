package com.home.springbootmybatis.controller;


import com.home.springbootmybatis.bean.User;
import com.home.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-20:00
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //根据ID查询用户
    @GetMapping("/query/{uid}")
    private User queryById(@PathVariable("uid") Integer uid) {
        return userService.queryById(uid);
    }
    //添加用户
@GetMapping("/insert")
    public User userAdd(User user){
        userService.UserAdd(user);
        return  user;
    }

    //修改用户
    @GetMapping("/update")
    public User update(User user){
        userService.updateUser(user);
        return user;
    }

    //删除用户
    @GetMapping("/delete/{uid}")
    public String delete(@PathVariable("uid")Integer uid){
        userService.deleteUser(uid);
        return "删除成功";
    }
}
