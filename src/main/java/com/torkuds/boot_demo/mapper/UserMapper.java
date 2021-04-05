package com.torkuds.boot_demo.mapper;

import com.torkuds.boot_demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int addUser(@Param("user") User user);

    User queryUser(@Param("name") String name, @Param("pswd") String pswd);
}
