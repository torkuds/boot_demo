package com.torkuds.boot_demo.service.impl;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.Goods;
import com.torkuds.boot_demo.mapper.GoodsMapper;
import com.torkuds.boot_demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public IResult addGoods(Goods goods) {
        if (goods == null)
            return new IResult("商品信息为空");

        int i = goodsMapper.addGood(goods);
        if (i > 0){
            return new IResult(true, "添加商品成功");
        } else {
            return new IResult("添加商品失败");
        }
    }

    @Override
    public List<Goods> queryAllGoods() {
        return goodsMapper.queryAllGoods();
    }

    @Override
    public IResult deleteGoodsById(int id) {
        int i = goodsMapper.deleteGoodsById(id);
        if (i > 0){
            return new IResult(true, "删除成功");
        }else {
            return new IResult("删除失败");
        }
    }
}
