package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.News;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface NewsMapperGB {

    void pubNews(long id, String title, String show, Timestamp time);

    List<News> getInfo(long id);
}
