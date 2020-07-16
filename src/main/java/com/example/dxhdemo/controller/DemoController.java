package com.example.dxhdemo.controller;


import com.example.dxhdemo.mapper.demoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DemoController {

    @RequestMapping("/test")
    public String demotest(){
        System.out.println("执行了跳转");
        return "test";
    }

    @RequestMapping("/index")
    public String demoIndex(){
        return "index";
    }


}
