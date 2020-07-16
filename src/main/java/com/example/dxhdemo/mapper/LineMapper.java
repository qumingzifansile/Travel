package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Line;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface LineMapper extends JpaRepository<Line,Integer> {

    @Query(value="SELECT * FROM line",nativeQuery = true)
    List<Line> findAll();                       //获取全部记录（包括已经结束的）

    @Query(value="SELECT * FROM line WHERE state = 1",nativeQuery = true)
    List<Line> findAllLive();                   //获取全部还没开始的线路记录

    Line findByTno(String tno);                 //通过旅游团编号查找记录
    Line findById(long id);                   //通过记录编号查找记录

    @Query(value="SELECT * FROM line WHERE cfd = #{cfd} AND (#{ddd} IS NULL OR ddd = #{ddd}) AND (#{ts} IS NULL OR ts = #{ts})",nativeQuery = true)
    List<Line> findByManyterms(String cfd,String ddd,String ts);                //多条件查询
}
