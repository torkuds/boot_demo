package com.torkuds.boot_demo.service.impl;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.UserOrder;
import com.torkuds.boot_demo.mapper.OrderMapper;
import com.torkuds.boot_demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IResult queryOrderList(int userId) {
        List<UserOrder> orders = orderMapper.queryOrderByUserId(userId);
        IResult<List> result = new IResult<>(true, "查询订单成功");
        result.setData(orders);
        return result;
    }
}
