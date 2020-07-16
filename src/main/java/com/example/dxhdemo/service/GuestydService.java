package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guestyd;

import java.sql.Timestamp;
import java.util.List;

public interface GuestydService {
    List<Guestyd> findAllGuestyds();             //查询所有订单
    int deleteOneGuestyd(int id);               //删除订单
    int changeOneGuestyd(int id,int uid, String tno, String guestname, String tel,
                         int crs, int xhs, Timestamp ydrq,String bah,int state);            //是修改哒！
}
