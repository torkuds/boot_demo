package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.base.IResult;

public interface IOrderService {
    IResult queryOrderList(int userId);
}
