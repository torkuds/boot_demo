package com.torkuds.boot_demo.entity;

import lombok.Data;

@Data
public class News {
    private int id;
    private String title;
    private String create_date;
    private String author;
    private String pic_url;
}
