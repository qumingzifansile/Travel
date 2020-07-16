package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Views;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ViewsMapperGB {
    Views getInfo(long id);

    Views getInfobyview(String view);

    void addView(String view,String ImageUrl,String Content,String city);

    List<Views> getAll();

    void addsView(String view);
}
