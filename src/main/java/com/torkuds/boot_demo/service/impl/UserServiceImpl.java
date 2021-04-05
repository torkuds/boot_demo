package com.torkuds.boot_demo.service.impl;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.User;
import com.torkuds.boot_demo.mapper.UserMapper;
import com.torkuds.boot_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IResult save(User user) {
        //TODO 校验注册信息

        int i = userMapper.addUser(user);
        IResult result;
        if (i > 0){
            result = new IResult(true, "注册成功");
        }else {
            result = new IResult("注册失败");
        }
        return result;
    }

    @Override
    public IResult login(String loginName, String pswd) {
        //TODO 校验登录信息

        IResult<User> result = new IResult<>();
        User user = userMapper.queryUser(loginName, pswd);
        if (user != null){
            result.setSuccess(true);
            result.setData(user);
            result.setMessage("登录成功");
        } else {
            result.setMessage("登录失败");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public IResult editUserInfo(User user) {
        return null;
    }

    @Override
    public List<User> queryAllUsers() {
        return null;
    }
}
