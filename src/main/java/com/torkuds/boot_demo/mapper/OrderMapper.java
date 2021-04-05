package com.torkuds.boot_demo.mapper;

import com.torkuds.boot_demo.entity.UserOrder;

import java.util.List;

public interface OrderMapper {
    List<UserOrder> queryOrderByUserId(int userId);
}
