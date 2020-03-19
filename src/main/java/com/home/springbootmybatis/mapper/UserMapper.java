package com.home.springbootmybatis.mapper;

import com.home.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-19:29
 */
@Mapper
public interface UserMapper {
    //根据Id查询用户
    public User queryById(Integer uid);

    //添加用户

    public void UserAdd(User user);

    //根据ID删除用户
    public void deleteUser(Integer uid);

    //根据id修改用户
    public void updateUser(User user);
}
