package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.bean.Travelview;

import java.sql.Timestamp;
import java.util.List;

public interface LineServiceGB {
    void addline(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                 int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                 String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                 String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                 String xgxl, String views, String weblog, double icrjg, double ixhjg, int state);                                      //新增线路信息
    void updateline(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                    int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                    String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                    String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                    String xgxl, String views, String weblog, double icrjg, double ixhjg, int state);         //修改线路信息
    void delline(String tno);                                                                                           //删除线路信息
    Line searchline(String tno);                                                                                        //通过旅行团查找线路信息
    List<Line> searchlinebyview(String views);                                                                          //通过景点查找线路信息
    List<Travelview> searchTno(long CompanyID);                                                                         //通过公司ID查找对应旅行团
}
