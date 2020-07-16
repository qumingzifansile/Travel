package com.example.dxhdemo.serviceImpl;


import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.mapper.LineMapper;
import com.example.dxhdemo.service.LineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class LineServiceImpl implements LineService {

    @Resource
    private LineMapper lineMapper;


    @Override
    //找到所有记录
    public List<Line> findAllLines() {
        return lineMapper.findAll();
    }

    @Override
    //找到所有记录（不包含结束的）
    public List<Line> findAllLiveLines() {
        return lineMapper.findAllLive();
    }

    @Override
    //通过旅游团查找记录
    public Line getOneLineByTno(String tno) {
        return lineMapper.findByTno(tno);
    }

    @Override
    //通过旅游团查找记录
    public Line getOneLineById(long id) {
        return lineMapper.findById(id);
    }

    @Override
    public List<Line> findLinesByManyterms(String cfd, String ddd, String ts) {
        return lineMapper.findByManyterms(cfd,ddd,ts);
    }

    @Override
    //通过一个id删除一条记录，删除通过改变记录的state状态
    public int deleteOneLineByTno(String tno) {
        Line oldline = getOneLineByTno(tno);
        oldline.setState(0);
        lineMapper.save(oldline);
        return 1;
    }

    @Override
    //通过id修改记录
    public int changeOneLineById(long id,String tno, String xlname, String tj, String dengji, String xltype,
                                  Timestamp xldate, int ts, int zrs, String dijie, String qp, String dp,
                                  String start, String jzd, String sz, String fc, String jz,
                                  String cfd, String ddd, int crxrs, int xhxrs, String xingchen,
                                  String xcap, String xcbz, String xcsm, String lxfs, String bak,
                                  int travel_bh, String travel_name, String status, String tp1js,
                                  String tp2js, String xgxl, String views, String weblog, double icrjg,
                                  double ixhjg, int state) {
        Line newline = getOneLineById(id);
        newline.setXlname(xlname);
        newline.setTj(tj);
        newline.setDengji(dengji);
        newline.setXltype(xltype);
        newline.setXldate(xldate);
        newline.setTs(ts);
        newline.setZrs(zrs);
        newline.setDijie(dijie);
        newline.setQp(qp);
        newline.setDp(dp);
        newline.setStart(start);
        newline.setJzd(jzd);
        newline.setSz(sz);
        newline.setFc(fc);
        newline.setJz(jz);
        newline.setCfd(cfd);
        newline.setDdd(ddd);
        newline.setCrxrs(crxrs);
        newline.setXhxrs(xhxrs);
        newline.setXingchen(xingchen);
        newline.setXcap(xcap);
        newline.setXcbz(xcbz);
        newline.setXcsm(xcsm);
        newline.setLxfs(lxfs);
        newline.setBak(bak);
        newline.setTravelBh(travel_bh);
        newline.setTravelName(travel_name);
        newline.setStatus(status);
        newline.setTp2Js(tp2js);
        newline.setTp1Js(tp1js);
        newline.setXgxl(xgxl);
        newline.setViews(views);
        newline.setWeblog(weblog);
        newline.setIcrjg(icrjg);
        newline.setIxhjg(ixhjg);
        newline.setState(state);
        lineMapper.save(newline);
        return 1;
    }

    @Override
    //通过tno修改记录
    public int changeOneLineByTno(String tno, String xlname, String tj, String dengji, String xltype,
                                 Timestamp xldate, int ts, int zrs, String dijie, String qp, String dp,
                                 String start, String jzd, String sz, String fc, String jz,
                                 String cfd, String ddd, int crxrs, int xhxrs, String xingchen,
                                 String xcap, String xcbz, String xcsm, String lxfs, String bak,
                                 int travel_bh, String travel_name, String status, String tp1js,
                                 String tp2js, String xgxl, String views, String weblog, double icrjg,
                                 double ixhjg, int state) {
        Line newline = getOneLineByTno(tno);
        newline.setXlname(xlname);
        newline.setTj(tj);
        newline.setDengji(dengji);
        newline.setXltype(xltype);
        newline.setXldate(xldate);
        newline.setTs(ts);
        newline.setZrs(zrs);
        newline.setDijie(dijie);
        newline.setQp(qp);
        newline.setDp(dp);
        newline.setStart(start);
        newline.setJzd(jzd);
        newline.setSz(sz);
        newline.setFc(fc);
        newline.setJz(jz);
        newline.setCfd(cfd);
        newline.setDdd(ddd);
        newline.setCrxrs(crxrs);
        newline.setXhxrs(xhxrs);
        newline.setXingchen(xingchen);
        newline.setXcap(xcap);
        newline.setXcbz(xcbz);
        newline.setXcsm(xcsm);
        newline.setLxfs(lxfs);
        newline.setBak(bak);
        newline.setTravelBh(travel_bh);
        newline.setTravelName(travel_name);
        newline.setStatus(status);
        newline.setTp2Js(tp2js);
        newline.setTp1Js(tp1js);
        newline.setXgxl(xgxl);
        newline.setViews(views);
        newline.setWeblog(weblog);
        newline.setIcrjg(icrjg);
        newline.setIxhjg(ixhjg);
        newline.setState(state);
        lineMapper.save(newline);
        return 1;
    }
}
