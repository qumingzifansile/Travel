package com.example.dxhdemo.mapper;


import com.example.dxhdemo.bean.Guestyd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface GuestydMapper extends JpaRepository<Guestyd,Long> {

    @Query(value = "SELECT * FROM guestyd",nativeQuery = true)
    List<Guestyd> findAllGuestyd();                    //查询所有订单

    Guestyd findById(long id);                          //

    //修改订单
    //删除订单
}
