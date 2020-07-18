package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Companyinfo;
import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.bean.Travelview;
import com.example.dxhdemo.mapper.*;
import com.example.dxhdemo.tools.MyTimeTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements com.example.dxhdemo.service.CompanyService {

    @Resource
    private LineMapperGB lineMapperGB;

    @Resource
    private TravelviewMapperGB travelviewMapperGB;

    @Resource
    private CompanyinfoMapperGB companyinfoMapperGB;

    @Resource
    private ViewsMapperGB viewsMapperGB;

    @Resource
    private LineviewMapperGB lineviewMapperGB;


    @Override
    public void publine(String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                        int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                        String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                        String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                        String xgxl, String views, String weblog, double icrjg, double ixhjg, int state) {
        StringBuilder sb = new StringBuilder();
        sb.append(Travel_bh);
        sb.append(new MyTimeTools().timetoString(new MyTimeTools().getCurrentTimeStamp().toString()));
        String tno = sb.toString();
        lineMapperGB.addLine(tno, xlname, tj, dengji, xltype, new MyTimeTools().getCurrentTimeStamp(), ts, zrs, dijie, qp, dp, start, jzd, sz, fc, jz, cfd,
                ddd, crxrs, xhxrs, xingchen, xcap, xcbz, xcsm, lxfs, bak, Travel_bh, Travel_name, status, tp1js, tp2js,
                xgxl, views, weblog, icrjg, ixhjg, state);
        Line line = lineMapperGB.getInfobytno(tno);
        travelviewMapperGB.pubTravelview(line.getTravelBh(), tno, xlname, dengji, xltype, ts, xcap, xcbz, xcsm);

        String[] splitviews = views.split(",");
        for (String s:splitviews) {
            if (viewsMapperGB.getInfobyview(s)==null){
                viewsMapperGB.addsView(s);
            }
            if (lineviewMapperGB.searchbytnoandviews(tno,viewsMapperGB.getInfobyview(s).getId())==null){
                lineviewMapperGB.addLineview(tno,viewsMapperGB.getInfobyview(s).getId());
            }
        }
    }


    @Override
    public void updateline(long companyid,String tno, String xlname, String tj, String dengji, String xltype, Timestamp xldate, int ts,
                           int zrs, String dijie, String qp, String dp, String start, String jzd, String sz, String fc, String jz,
                           String cfd, String ddd, int crxrs, int xhxrs, String xingchen, String xcap, String xcbz, String xcsm,
                           String lxfs, String bak, long Travel_bh, String Travel_name, String status, String tp1js, String tp2js,
                           String xgxl, String views, String weblog, double icrjg, double ixhjg, int state) {
        travelviewMapperGB.updateTravelview(companyid, tno, xlname, dengji, xltype, ts, xcap, xcbz, xcsm);
        lineMapperGB.updateLine(tno, xlname, tj, dengji, xltype, xldate, ts, zrs, dijie, qp, dp, start, jzd, sz, fc, jz,
                cfd, ddd, crxrs, xhxrs, xingchen, xcap, xcbz, xcsm, lxfs, bak, Travel_bh, Travel_name, status, tp1js,
                tp2js, xgxl, views, weblog, icrjg, ixhjg, state);
    }

    @Override
    public List<Line> searchlinebycompany(long companyid) {
        List<Travelview> list = travelviewMapperGB.getMyTravelview(companyid);
        List<Line> lineList = new ArrayList<>();
        if (list!=null){
            for (Travelview travelview : list) {
                Line line = lineMapperGB.getInfobytno(travelview.getTno());
                if (line != null) {
                    lineList.add(line);
                }
            }
        }
        return lineList;
    }

    @Override
    public void updateCompany(long CompanyID, String Password, String About, String Title, String Description,
                              String Keywords, String PhoneNumber, String Address, String RegPhone) {
        companyinfoMapperGB.update(CompanyID, Password, About, Title, Description, Keywords, PhoneNumber, Address,
                RegPhone);
    }

    @Override
    public void delline(String tno) {
        travelviewMapperGB.delTravelview(tno);
        lineMapperGB.delLine(tno);
    }

    @Override
    public Companyinfo getInfo(long CompanyID) {
        return companyinfoMapperGB.getMyInfo(CompanyID);
    }

    @Override
    public Companyinfo login(String RegPhone, String password) {
        return companyinfoMapperGB.login(RegPhone, password);
    }

    @Override
    public void reg(String Password, String About, String Title, String Description, String Keywords, String PhoneNumber, String Address, String RegPhone) {
        companyinfoMapperGB.reg(Password, About, Title, Description, Keywords, PhoneNumber, Address, RegPhone);
    }

    @Override
    public List<Companyinfo> getAllinfo() {
        return companyinfoMapperGB.getAll();
    }

    @Override
    public void delInfo(long id) {
        companyinfoMapperGB.delInfo(id);
    }
}
