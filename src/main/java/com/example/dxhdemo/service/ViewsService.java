package com.example.dxhdemo.service;


import com.example.dxhdemo.bean.Views;

import java.util.List;

public interface ViewsService {

    List<Views> findAllViews();             //获取全部景点
    int deleteOneView(int id);              //删除景点
    int changeOneView(int id,String view,String imageUrl,String content,String city);              //修改景点
    List<Views> findSomeViews(String city);            //获取部分景点
}
