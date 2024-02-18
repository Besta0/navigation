package com.example.dao.mapper;

import com.example.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface UserMapper {
    public List<User> getAllUsers();

    int addUser(User user);//增加用户
    int deleteUser(String username);//删除用户
    User getUserByUsernameAndPassword();//得到用户密码
    int updateUser(User user);//更新用户信息
    User getUserByUsername(String un);//通过用户id获得所有用户信息

}
