package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.mapper.LineMapper;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

public interface LineService {

    List<Line> findAllLines();                      //找到全部记录（包括结束的）
    List<Line> findAllLiveLines();                  //找到所有记录（不包括结束的）
    int deleteOneLineByTno(String tno);             //删除线路记录
    int changeOneLineByTno(String tno, String xlname, String tj, String dengji, String xltype,
                           Timestamp xldate, int ts, int zrs, String dijie, String qp, String dp,
                           String start, String jzd, String sz, String fc, String jz,
                           String cfd, String ddd, int crxrs, int xhxrs, String xingchen,
                           String xcap, String xcbz, String xcsm, String lxfs, String bak,
                           int travel_bh, String travel_name, String status, String tp1js,
                           String tp2js, String xgxl, String views, String weblog, double icrjg,
                           double ixhjg, int state);             //修改线路记录
    int changeOneLineById(long id,String tno, String xlname, String tj, String dengji, String xltype,
                           Timestamp xldate, int ts, int zrs, String dijie, String qp, String dp,
                           String start, String jzd, String sz, String fc, String jz,
                           String cfd, String ddd, int crxrs, int xhxrs, String xingchen,
                           String xcap, String xcbz, String xcsm, String lxfs, String bak,
                           int travel_bh, String travel_name, String status, String tp1js,
                           String tp2js, String xgxl, String views, String weblog, double icrjg,
                           double ixhjg, int state);             //修改线路记录
                                                    //插入一个线路记录
    Line getOneLineByTno(String tno);               //获取一个记录
    Line getOneLineById(long id);                    //获取一个记录
    List<Line> findLinesByManyterms(String cfd,String ddd,String ts);                //多条件查询


}
