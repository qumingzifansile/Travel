package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Guestbook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestbookMapperGB {

    void book(String title,String email,String tel,String name,String addr,String content);

    List<Guestbook> getAll();

}
