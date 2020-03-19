package com.home.springbootmybatis.service;

import com.home.springbootmybatis.bean.User;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-19:36
 */
public interface UserService {
    //根据Id查询用户
    public User queryById(Integer uid);

    //添加用户
    public void UserAdd(User user);

    //根据ID删除用户
    public void deleteUser(Integer uid);

    //根据id修改用户
    public void updateUser(User user);

}
