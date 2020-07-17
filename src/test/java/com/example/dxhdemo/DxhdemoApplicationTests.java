package com.example.dxhdemo;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.service.LineService;
import com.example.dxhdemo.service.LineServiceGB;
import com.example.dxhdemo.service.demoService;
import com.example.dxhdemo.serviceImpl.demoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DxhdemoApplicationTests {

    @Resource
    demoService demoservice;

    @Resource
    LineServiceGB lineService;

    @Test
    public void contextLoads() {
        List<Line> line = lineService.searchlinebyview("1");
        System.out.println(line);
    }

}
