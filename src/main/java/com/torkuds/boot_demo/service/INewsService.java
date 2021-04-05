package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INewsService {
    IResult<List<News>> queryAll();

    IResult insertAll(@Param("newsList")List<News> newsList);
    IResult insert(@Param("news")News news);
}
