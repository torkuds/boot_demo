package com.torkuds.boot_demo.controller;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("boot/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/queryUserOrders")
    @ResponseBody
    public IResult queryUserOrders(int userId){

        return orderService.queryOrderList(userId);
    }
}
