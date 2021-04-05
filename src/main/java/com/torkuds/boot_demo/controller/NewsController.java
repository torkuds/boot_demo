package com.torkuds.boot_demo.controller;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.News;
import com.torkuds.boot_demo.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("boot/news")
public class NewsController {

    @Autowired
    private INewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/addAllNews", method = RequestMethod.POST)
    public IResult addAllNews(@RequestBody List<News> newsList){

        return newsService.insertAll(newsList);

    }

    @ResponseBody
    @RequestMapping(value = "/addNews", method = RequestMethod.POST)
    public IResult addNews(@RequestBody News news){

        return newsService.insert(news);

    }

    @ResponseBody
    @RequestMapping(value = "getNewsList", method = RequestMethod.POST)
    public IResult<List<News>> getNewsList(){
        return newsService.queryAll();
    }
}
