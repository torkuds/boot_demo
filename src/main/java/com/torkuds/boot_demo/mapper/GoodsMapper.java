package com.torkuds.boot_demo.mapper;

import com.torkuds.boot_demo.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    int addGood(@Param("goods")Goods good);

    Goods queryGoodsById(Integer id);

    Goods queryGoodsByName(String goodsname);

    int deleteGoodsById(Integer id);

    List<Goods> queryAllGoods();


}
