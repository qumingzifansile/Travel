package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface GuestMapper extends JpaRepository<Guest,Integer>{

    Guest findGuestByTelephone(String phonenumber);     //  通过电话号码查找
    @Query(value="SELECT * FROM guest",nativeQuery=true)
    List<Guest> findAllGuest();                              //  查找所有普通用户
//    void deleteByGuestId(Long id);                      //  删除用户
//    void updateGuest(Guest guest);                     //  修改某个用户
}
