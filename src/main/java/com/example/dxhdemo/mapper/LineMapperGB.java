package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Line;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface LineMapperGB {
    List<Line> getInfo(String views);

    void addLine(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, long ts, long zrs,
                 String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz, String cfd,
                 String ddd, String crxrs, String xhxrs, String xingchen, String xcap, String xcbz, String xcsm, String lxfs,
                 String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js, String xgxl,
                 String views, String weblog, double icrjg, double ixhjg, long state);

    void delLine(String tno);

    void updateLine(String tno,String xlname,String tj,String dengji,String xltype,String xldate,long ts,long zrs,
                    String dijie,String qp,String dp,String start,String jzd,String sz,String fc,String jz,String cfd,
                    String ddd,String crxrs,String xhxrs,String xingchen,String xcap,String xcbz,String xcsm,String lxfs,
                    String bak,long Travel_bh,String Travel_name,String status,String tp1js,String tp2js,String xgxl,
                    String views,String weblog,double icrjg,double ixhjg,long state);

    Line getInfobytno(String tno);
}
