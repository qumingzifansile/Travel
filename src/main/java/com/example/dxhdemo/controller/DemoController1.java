package com.example.dxhdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Resonbody +controller
public class DemoController1 {

    @RequestMapping("/demo")
    public String demo(){
        return "这是demo";
    }
}
