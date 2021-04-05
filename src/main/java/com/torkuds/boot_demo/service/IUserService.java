package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.User;

import java.util.List;

public interface IUserService {

    IResult save(User user);

    IResult login(String name, String pswd);

    IResult editUserInfo(User user);

    List<User> queryAllUsers();
}
