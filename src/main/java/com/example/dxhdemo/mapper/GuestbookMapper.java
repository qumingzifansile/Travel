package com.example.dxhdemo.mapper;


import com.example.dxhdemo.bean.Guestbook;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.security.Timestamp;
import java.util.List;

@Mapper
public interface GuestbookMapper extends JpaRepository<Guestbook,Long> {

    @Query(value = "SELECT * FROM guestbook" ,nativeQuery = true)
    List<Guestbook> findAll();                      //获取全部留言
    @Query(value = "SELECT * FROM guestbook WHERE date_sub(curdate(),interval 30 day) <= date(time)" ,nativeQuery = true)
    List<Guestbook> findSome();                     //以时间为标记获取部分留言
    Guestbook findById(long id);                     //删除留言
}
