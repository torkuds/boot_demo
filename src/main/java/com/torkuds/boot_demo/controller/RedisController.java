package com.torkuds.boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/setGet", method = RequestMethod.GET)
    public String setGet(){
        stringRedisTemplate.opsForValue().set("country", "China");
        return stringRedisTemplate.opsForValue().get("country");
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/setKeyTime", method = RequestMethod.GET)
    public String setKeyTime(){
        redisTemplate.opsForValue().set("timeKey", "timeValue", 10, TimeUnit.SECONDS);
        return "success";
    }

    @RequestMapping(value = "/getKeyTime", method = RequestMethod.GET)
    public String getKeyTime(){
        return String.valueOf(redisTemplate.opsForValue().get("timeKey"));
    }
}
