package com.torkuds.boot_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private Integer id;
    private String goodsName;
    private BigDecimal price;
}
