package com.torkuds.boot_demo.entity;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer tradeNum;
}
