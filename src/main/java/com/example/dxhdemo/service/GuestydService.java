package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guestyd;

import java.sql.Timestamp;
import java.util.List;

public interface GuestydService {
    List<Guestyd> findAllGuestyds();             //查询所有订单
    int deleteOneGuestyd(long id);               //删除订单
    int changeOneGuestyd(long id,long uid, String tno, String guestname, String tel,
                         int crs, int xhs, Timestamp ydrq,String bah,int state);            //是修改哒！
    void changeGuestyd(long id,long uid, String tno, String guestname, String tel,
    int crs, int xhs, String bah,int state);                             //修改日期之外的属性

}
