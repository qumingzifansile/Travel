package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.bean.Guestyd;

import java.sql.Timestamp;
import java.util.List;

public interface GuestService {
    Guest loginin(String telephone, String pass);                                                                       //用户登录
    void guestyd(long uid, String tno, String guestname, String tel, long crs, long xhs, Timestamp ydrq, String bah);   //用户预定
    void guestbook(String title,String email,String tel,String name,String addr,String content);                        //用户留言
    List<Guestyd> guestsearchyd(long id);                                                                               //用户查询订单
    void guestupdate(long GuestID,String name,String pass,String sex,String email,String telephone,String idnumber,String address);    //用户更新数据
    void guestreg(String name,String pass,String sex,String email,String telephone,String idnumber);                    //用户注册
    List<Guest> getall();                                                                                               //获取全部用户信息
    void delguest(long GuestID);                                                                                        //删除特定用户信息
}
