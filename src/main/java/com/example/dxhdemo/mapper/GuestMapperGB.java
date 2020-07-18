package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestMapperGB {

    Guest login(String telephone, String pass);

    void reg(String name,String pass,String sex,String email,String telephone,String idnumber);

    void update(long GuestID,String name,String pass,String sex,String email,String telephone,String idnumber,String address);
    List<Guest> getall();

    void delguest(long GuestID);

}
