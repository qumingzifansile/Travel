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

    @RequestMapping("/yyform")
    public String demoYyform(){
        return "yyform";
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

    @RequestMapping("/adminLinesIframe")
    public String demoAdminLinesIframe(){
        return "adminLinesIframe";
    }

    @RequestMapping("/companyInfo")
    public String demoCompanyInfo(){
        return "CompanyInfo";
    }

    @RequestMapping("/CompanyLines")
    public String demoCompanylines(){return "CompanyLines";}

    @RequestMapping("/adminguestyd")
    public String demoAdminguestyd(){return "adminGuestyd"; }

    @RequestMapping("/admininfo")
    public String demoAdminInfo(){ return "adminInfo"; }

    @RequestMapping("/adminguestbook")
    public String demoadminguestbook(){ return "adminGuestbook"; }

    @RequestMapping("/adminviews")
    public String demoadminviews(){ return "adminViews"; }

    @RequestMapping("/views")
    public String demoViews(){
        return "views";
    }
}
