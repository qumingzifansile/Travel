package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.bean.Guestyd;
import com.example.dxhdemo.mapper.*;
import com.example.dxhdemo.service.GuestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Resource
    private GuestMapperGB guestMapperGB;

    @Resource
    private GuestydMapperGB guestydMapperGB;

    @Resource
    private GuestbookMapperGB guestbookMapperGB;



    @Override
    public Guest loginin(String telephone, String pass) {                           //用户登录
        return guestMapperGB.login(telephone,pass);
    }

    @Override
    public void guestyd(long uid, String tno, String guestname, String tel, long crs, long xhs, Timestamp ydrq, String bah) {
        guestydMapperGB.guestYd(uid, tno, guestname, tel, crs, xhs, ydrq, bah);
    }

    @Override
    public void guestbook(String title, String email, String tel, String name, String addr, String content) {
        guestbookMapperGB.book(title, email, tel, name, addr, content);
    }

    @Override
    public List<Guestyd> guestsearchyd(long id) {
        List<Guestyd> guestydList = guestydMapperGB.getTnoInfo(id);
        return guestydList;
    }

    @Override
    public void guestupdate(long GuestID, String name, String pass, String sex, String email, String telephone, String idnumber,String address) {
        guestMapperGB.update(GuestID, name, pass, sex, email, telephone, idnumber, address);
    }

    @Override
    public void guestreg(String name, String pass, String sex, String email, String telephone, String idnumber) {
        guestMapperGB.reg(name, pass, sex, email, telephone, idnumber);
    }


    @Override
    public List<Guest> getall() {
        return guestMapperGB.getall();
    }

    @Override
    public void delguest(long GuestID) {
        guestMapperGB.delguest(GuestID);
    }

}
