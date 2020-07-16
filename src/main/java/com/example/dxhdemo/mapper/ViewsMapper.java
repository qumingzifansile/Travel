package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Views;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface ViewsMapper extends JpaRepository<Views,Integer> {

    @Query(value="SELECT * FROM views",nativeQuery = true)
    List<Views> findAllViews();                 //查询所有景点信息
    //删除景点信息
    //修改经典信息

    Views findById(int id);                     //获取景点信息

    @Query(value="SELECT * FROM views WHERE city = #{city}",nativeQuery = true)
    List<Views> findByCity(String city);              //根据城市获取景点信息
}
