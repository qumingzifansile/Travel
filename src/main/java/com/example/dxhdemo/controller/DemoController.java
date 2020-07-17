package com.example.dxhdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/detail")
    public String demoDetail(){
        return "detail";
    }

    @RequestMapping("/company")
    public String demoCompany(){
        return "company";
    }

    @RequestMapping("/login")
    public String demoLogin(){
        return "login";
    }

    @RequestMapping("/register")
    public String demoRegister(){
        return "register";
    }

    @RequestMapping("/result")
    public String demoResult(){
        return "result";
    }

    @RequestMapping("/userinfo")
    public String demoUserinfo(){
        return "userinfo";
    }

    @RequestMapping("/fp")
    public String demoFp(){
        return "fp";
    }

    @RequestMapping("/userdetail")
    public String demoUserdetail(){
        return "userdetail";
    }

    @RequestMapping("/adminlines")
    public String demoAdmin(){
        return "adminLines";
    }

}
