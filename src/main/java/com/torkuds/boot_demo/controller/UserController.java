package com.torkuds.boot_demo.controller;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.User;
import com.torkuds.boot_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("boot/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public IResult register(String name, String pswd){

        User user = new User();
        user.setUserName(name);
        user.setPswd(pswd);

        return userService.save(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public IResult login(@RequestBody String loginName, String password){

        return userService.login(loginName, password);
    }

}
