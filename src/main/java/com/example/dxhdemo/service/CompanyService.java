package com.example.dxhdemo.service;


import com.example.dxhdemo.bean.Companyinfo;
import com.example.dxhdemo.bean.Line;

import java.util.List;

public interface CompanyService {
    void publine(long companyid,String tno,String xlname,String tj,String dengji,String xltype,long ts,
                 long zrs, String dijie,String qp,String dp,String start,String jzd,String sz,String fc,String jz,
                 String cfd, String ddd,String crxrs,String xhxrs,String xingchen,String xcap,String xcbz,String xcsm,
                 String lxfs, String bak,long Travel_bh,String Travel_name,String status,String tp1js,String tp2js,
                 String xgxl, String views,String weblog,double icrjg,double ixhjg,long state);                         //公司发布线路
    void updateline(long companyid,String tno,String xlname,String tj,String dengji,String xltype,String xldate,long ts,
                    long zrs, String dijie,String qp,String dp,String start,String jzd,String sz,String fc,String jz,
                    String cfd, String ddd,String crxrs,String xhxrs,String xingchen,String xcap,String xcbz,
                    String xcsm,String lxfs, String bak,long Travel_bh,String Travel_name,String status,String tp1js,
                    String tp2js,String xgxl, String views,String weblog,double icrjg,double ixhjg,long state);         //公司修改线路
    List<Line> searchlinebycompany(long companyid);                                                                     //公司查询自己发布的所有旅行线路信息
    void updateCompany(long CompanyID,String Password, String About, String Title, String Description, String Keywords,
                       String PhoneNumber, String Address, String RegPhone);                                            //公司修改自身属性
    void delline(String tno);                                                                                           //公司删除线路
    Companyinfo getInfo(long CompanyID);                                                                                //公司查询自己的信息
    Companyinfo login(String RegPhone, String password);                                                                //公司登录
    void reg(String Password, String About, String Title, String Description, String Keywords,
                    String PhoneNumber, String Address, String RegPhone);                                               //公司注册
}
