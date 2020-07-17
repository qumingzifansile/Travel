package com.example.dxhdemo.controller;


import com.example.dxhdemo.bean.*;
import com.example.dxhdemo.service.GuestService;
import com.example.dxhdemo.service.InfoService;
import com.example.dxhdemo.service.LineService;
import com.example.dxhdemo.service.LineServiceGB;
import com.example.dxhdemo.tools.MyTimeTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class GuestController {

    @Resource
    private GuestService guestService;

    @Resource
    private InfoService infoService;

    @Resource
    private LineServiceGB lineService;

    private long GuestID = -1;

    private Guest guest;

    //用户登录
    @RequestMapping("/guest/login")
    public int guestlogin(@RequestParam("telephone") String telephone, @RequestParam("pass") String pass){
        guest = guestService.loginin(telephone, pass);
        if (guest!=null){
            GuestID = guest.getGuestId();
            return 1;
        }else
            return 0;
    }

    //用户注册
    @RequestMapping("/guest/reg")
    public int guestreg(@RequestParam("name") String name, @RequestParam("pass") String pass,
                        @RequestParam("sex") String sex, @RequestParam("email") String email,
                        @RequestParam("telephone") String telephone, @RequestParam("idnumber") String idnumber){
        guestService.guestreg(name, pass, sex, email, telephone, idnumber);
        return 1;
    }

    //用户退出
    @RequestMapping("/guest/quit")
    public int guestquit(){
        guest = null;
        GuestID = -1;
        return 1;
    }

    //用户预定
    @RequestMapping("/guest/yd")
    public int guestyd(@RequestParam("tno") String tno, @RequestParam("guestname") String guestname,
                       @RequestParam("tel") String tel, @RequestParam("crs") long crs, @RequestParam("xhs") long xhs,
                       @RequestParam("bah") String bah){
        if (GuestID!=-1) {
            MyTimeTools myTimeTools = new MyTimeTools();
            guestService.guestyd(GuestID, tno, guestname, tel, crs, xhs, myTimeTools.getCurrentTimeStamp(), bah);
            return 1;
        }else
            return 0;
    }

    //用户留言
    @RequestMapping("/guest/book")
    public int guestbook(@RequestParam("title") String title, @RequestParam("email") String email,
                         @RequestParam("tel") String tel, @RequestParam("name") String name,
                         @RequestParam("addr") String addr, @RequestParam("content") String content){
        guestService.guestbook(title, email, tel, name, addr, content);
        return 1;
    }

    //用户查询自己的订单
    @RequestMapping("/guest/searchyd")
    public List<Guestyd> guestsearchyd(){
        if (GuestID!=-1){
            return guestService.guestsearchyd(GuestID);
        }else
            return null;
    }

    //用户更新自身属性
    @RequestMapping("/guest/update")
    public int updateguest(@RequestParam("name") String name, @RequestParam("pass") String pass,
                           @RequestParam("sex") String sex, @RequestParam("email") String email,
                           @RequestParam("telephone") String telephone, @RequestParam("idnumber") String idnumber){
        if (GuestID!=-1){
            guestService.guestupdate(GuestID, name, pass, sex, email, telephone, idnumber);
            return 1;
        }else
            return 0;
    }

    //用户根据景点查找线路
    @RequestMapping("/guest/searchline")
    public List<Line> guestsearchline(@RequestParam("views") String views){
        return lineService.searchlinebyview(views);
    }

    //查找所有用户留言
    @RequestMapping("/guest/getallbook")
    public List<Guestbook> getallguestbook(){
        return infoService.getGuestbook();
    }

    //根据景点查找对应新闻
    @RequestMapping("/guest/getnewsbyviews")
    public List<News> getNewsbyviews(@RequestParam("views") String views){
        return infoService.getInfobyID(infoService.getViews(views).getId());
    }

}
