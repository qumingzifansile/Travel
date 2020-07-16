package com.example.dxhdemo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dxhdemo.mapper")
public class DxhdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DxhdemoApplication.class, args);
    }

}
