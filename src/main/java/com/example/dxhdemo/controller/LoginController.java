package com.example.dxhdemo.controller;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/loginReuslt")
    //登录验证，若不存在相关记录则返回false，存在则返回true进行下一步操作
    public boolean loginResult(@RequestParam("telephone") String  phonenumber){
        Guest guest = userService.getGuestInfo(phonenumber);
        if(guest == null){
            return false;
        }{
            return true;
        }
    }

}
