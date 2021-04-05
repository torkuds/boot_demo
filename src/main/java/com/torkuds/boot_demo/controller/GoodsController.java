package com.torkuds.boot_demo.controller;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.Goods;
import com.torkuds.boot_demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("boot/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public IResult add(@RequestBody Goods goods){

        return goodsService.addGoods(goods);
    }

    @PostMapping("/getGoodsList")
    @ResponseBody
    public IResult getGoodsList(){

        List<Goods> goodsList = goodsService.queryAllGoods();

        IResult<List> result = new IResult<>();
        result.setSuccess(true);
        result.setMessage("查询成功");
        result.setData(goodsList);

        return result;
    }

    @PostMapping("/deleteGoods")
    @ResponseBody
    public IResult deleteGoods(int id){
        return goodsService.deleteGoodsById(id);
    }

}
