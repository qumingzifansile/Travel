package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.mapper.demoMapper;
import com.example.dxhdemo.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class demoServiceImpl implements demoService {

    @Resource
    private demoMapper demomapper;

//    @Override
//    public Guest show(String name, String pass) {
//        System.out.println("执行了show");
//        return demomapper.getInfo(name,pass);
//    }
//
//    @Override
//    public List<Guest> showAll(){
//        return demomapper.getAll();
//    }

    @Override
    public Guest showByName(String name) {
        return demomapper.findByName(name);
    }


}
