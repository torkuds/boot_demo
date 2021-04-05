package com.torkuds.boot_demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserOrder implements Serializable{
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer tradeNum;
    private String userName;
    private String goodsName;
    private BigDecimal goodsPrice;
}
