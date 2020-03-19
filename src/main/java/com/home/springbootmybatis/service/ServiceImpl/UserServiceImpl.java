package com.home.springbootmybatis.service.ServiceImpl;

import com.home.springbootmybatis.bean.User;
import com.home.springbootmybatis.mapper.UserMapper;
import com.home.springbootmybatis.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-20:04
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Integer uid) {
        return userMapper.queryById(uid);
    }

    @Override
    public void UserAdd(User user) {
        userMapper.UserAdd(user);
    }

    @Override
    public void deleteUser(Integer uid) {
        userMapper.deleteUser(uid);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
