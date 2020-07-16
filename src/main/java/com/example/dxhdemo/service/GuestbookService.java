package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guestbook;

import java.util.List;

public interface GuestbookService {
    List<Guestbook> findAllGuestbooks();        //获取全部留言
    List<Guestbook> findSomeGuestbooks();       //获取部分留言
    int deleteOneGuestbook(int id);             //删除留言
}
