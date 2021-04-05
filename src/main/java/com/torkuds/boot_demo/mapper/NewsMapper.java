package com.torkuds.boot_demo.mapper;

import com.torkuds.boot_demo.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int insertAll(@Param("newsList") List<News> newsList);

    int insert(@Param("news") News news);

    List<News> queryAll();
}
