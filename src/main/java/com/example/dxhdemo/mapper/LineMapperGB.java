package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Line;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface LineMapperGB {
    List<Line> getInfo(String views);

    void addLine(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                 int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                 String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                 String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                 String xgxl, String views, String weblog, double icrjg, double ixhjg, int state);

    void delLine(String tno);

    void updateLine(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                    int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                    String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                    String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                    String xgxl, String views, String weblog, double icrjg, double ixhjg, int state);

    Line getInfobytno(String tno);
}
