package com.example.dxhdemo.serviceImpl;


import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.bean.Lineview;
import com.example.dxhdemo.bean.Travelview;
import com.example.dxhdemo.bean.Views;
import com.example.dxhdemo.mapper.*;
import com.example.dxhdemo.service.LineService;
import com.example.dxhdemo.service.LineServiceGB;
import com.example.dxhdemo.tools.MyTimeTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class LineServiceImplGB implements LineServiceGB {


    @Resource
    private LineMapperGB lineMapperGB;

    @Resource
    private LineviewMapperGB lineviewMapperGB;

    @Resource
    private TravelviewMapperGB travelviewMapperGB;

    @Resource
    private ViewsMapperGB viewsMapperGB;

    @Resource
    private LineMapper lineMapper;

    @Override
    public void addline(String tno,String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                        int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                        String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                        String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                        String xgxl, String views, String weblog, double icrjg, double ixhjg, int state) {
        StringBuilder sb = new StringBuilder();
        sb.append(Travel_bh);
        sb.append(new MyTimeTools().timetoString(new MyTimeTools().getCurrentTimeStamp().toString()));

        lineMapperGB.addLine(sb.toString(),xlname, tj, dengji, xltype,new MyTimeTools().getCurrentTimeStamp(), ts, zrs, dijie, qp, dp, start, jzd, sz, fc, jz, cfd,
                ddd, crxrs, xhxrs, xingchen, xcap, xcbz, xcsm, lxfs, bak, Travel_bh, Travel_name, status, tp1js, tp2js,
                xgxl, views, weblog, icrjg, ixhjg, state);
    }

    @Override
    public void updateline(String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                           int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                           String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                           String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                           String xgxl, String views, String weblog, double icrjg, double ixhjg, int state) {
        lineMapperGB.updateLine(tno, xlname, tj, dengji, xltype, xldate, ts, zrs, dijie, qp, dp, start, jzd, sz, fc, jz,
                cfd, ddd, crxrs, xhxrs, xingchen, xcap, xcbz, xcsm, lxfs, bak, Travel_bh, Travel_name, status, tp1js,
                tp2js, xgxl, views, weblog, icrjg, ixhjg, state);
    }

    @Override
    public void delline(String tno) {
        lineMapperGB.delLine(tno);
    }

    @Override
    public Line searchline(String tno) {
        return lineMapperGB.getInfobytno(tno);
    }

    @Override
    public List<Line> searchlinebyview(String views) {
        Views view = viewsMapperGB.getInfobyview(views);
        if(view!=null) {
            List<Lineview> lineviewList = lineviewMapperGB.getTno(viewsMapperGB.getInfobyview(views).getId());
            List<Line> lineList = new ArrayList<>();
            if (lineviewList != null) {
                for (Lineview l : lineviewList) {
                    Line line = lineMapperGB.getInfobytno(l.getTno());
                    if (line.getState() == 1 && line.getStatus().equals("1")) {
                        lineList.add(line);
                    }
                }
            }
            return lineList;
        }else{
            return null;
        }
    }

    @Override
    public List<Travelview> searchTno(long CompanyID) {
        return travelviewMapperGB.getMyTravelview(CompanyID);
    }

}
