package com.torkuds.boot_demo.service.impl;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.News;
import com.torkuds.boot_demo.mapper.NewsMapper;
import com.torkuds.boot_demo.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;


    @Override
    public IResult<List<News>> queryAll() {
        IResult<List<News>> result = new IResult<>();
        result.setData(newsMapper.queryAll());
        result.setMessage("获取成功");
        return result;
    }

    @Override
    public IResult insertAll(List<News> newsList) {
        IResult result = new IResult();
        int i = newsMapper.insertAll(newsList);
        if (i > 0){
            result.setSuccess(true);
            result.setMessage("插入成功");
        } else {
            result.setSuccess(false);
            result.setMessage("插入失败");
        }
        return result;
    }

    @Override
    public IResult insert(News news) {
        IResult result = new IResult();
        int i = newsMapper.insert(news);
        if (i > 0){
            result.setSuccess(true);
            result.setMessage("插入成功");
        } else {
            result.setSuccess(false);
            result.setMessage("插入失败");
        }
        return result;
    }
}
