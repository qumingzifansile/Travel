package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface demoMapper extends JpaRepository<Guest,Integer> {
//    Guest getInfo(String name,String pass);
//    List<Guest> getAll();
    Guest findByName(String name);
}
