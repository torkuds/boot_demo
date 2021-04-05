package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsService {

    IResult addGoods(@Param("goods")Goods goods);

    List<Goods> queryAllGoods();

    IResult deleteGoodsById(int id);
}
