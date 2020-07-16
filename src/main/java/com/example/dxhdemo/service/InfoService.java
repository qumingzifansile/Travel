package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guestbook;
import com.example.dxhdemo.bean.News;
import com.example.dxhdemo.bean.Views;

import java.sql.Timestamp;
import java.util.List;

public interface InfoService {
    List<News> getInfobyID(long id);                                                                                    //根据景点编号查找新闻
    void pubNews(long id, String title, String show, Timestamp time);                                                   //发布新闻
    Views getViews(String view);                                                                                        //根据景点名称查找景点编号
    List<Guestbook> getGuestbook();                                                                                     //获取所有留言
}
