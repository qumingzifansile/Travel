package com.example.dxhdemo.bean;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name= "line")
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String tno;
    private String xlname;
    private String tj;
    private String dengji;
    private String xltype;
    private java.sql.Timestamp xldate;
    private int ts;
    private int zrs;
    private String dijie;
    private String qp;
    private String dp;
    private String start;
    private String jzd;
    private String sz;
    private String fc;
    private String jz;
    private String cfd;
    private String ddd;
    private int crxrs;
    private int xhxrs;
    private String xingchen;
    private String xcap;
    private String xcbz;
    private String xcsm;
    private String lxfs;
    private String bak;
    private int travelBh;
    private String travelName;
    private String status;
    private String tp1Js;
    private String tp2Js;
    private String xgxl;
    private String views;
    private String weblog;
    private double icrjg;
    private double ixhjg;
    private int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getXlname() {
        return xlname;
    }

    public void setXlname(String xlname) {
        this.xlname = xlname;
    }

    public String getTj() {
        return tj;
    }

    public void setTj(String tj) {
        this.tj = tj;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public String getXltype() {
        return xltype;
    }

    public void setXltype(String xltype) {
        this.xltype = xltype;
    }

    public Timestamp getXldate() {
        return xldate;
    }

    public void setXldate(Timestamp xldate) {
        this.xldate = xldate;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getZrs() {
        return zrs;
    }

    public void setZrs(int zrs) {
        this.zrs = zrs;
    }

    public String getDijie() {
        return dijie;
    }

    public void setDijie(String dijie) {
        this.dijie = dijie;
    }

    public String getQp() {
        return qp;
    }

    public void setQp(String qp) {
        this.qp = qp;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getJzd() {
        return jzd;
    }

    public void setJzd(String jzd) {
        this.jzd = jzd;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getJz() {
        return jz;
    }

    public void setJz(String jz) {
        this.jz = jz;
    }

    public String getCfd() {
        return cfd;
    }

    public void setCfd(String cfd) {
        this.cfd = cfd;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public int getCrxrs() {
        return crxrs;
    }

    public void setCrxrs(int crxrs) {
        this.crxrs = crxrs;
    }

    public int getXhxrs() {
        return xhxrs;
    }

    public void setXhxrs(int xhxrs) {
        this.xhxrs = xhxrs;
    }

    public String getXingchen() {
        return xingchen;
    }

    public void setXingchen(String xingchen) {
        this.xingchen = xingchen;
    }

    public String getXcap() {
        return xcap;
    }

    public void setXcap(String xcap) {
        this.xcap = xcap;
    }

    public String getXcbz() {
        return xcbz;
    }

    public void setXcbz(String xcbz) {
        this.xcbz = xcbz;
    }

    public String getXcsm() {
        return xcsm;
    }

    public void setXcsm(String xcsm) {
        this.xcsm = xcsm;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public int getTravelBh() {
        return travelBh;
    }

    public void setTravelBh(int travelBh) {
        this.travelBh = travelBh;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTp1Js() {
        return tp1Js;
    }

    public void setTp1Js(String tp1Js) {
        this.tp1Js = tp1Js;
    }

    public String getTp2Js() {
        return tp2Js;
    }

    public void setTp2Js(String tp2Js) {
        this.tp2Js = tp2Js;
    }

    public String getXgxl() {
        return xgxl;
    }

    public void setXgxl(String xgxl) {
        this.xgxl = xgxl;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getWeblog() {
        return weblog;
    }

    public void setWeblog(String weblog) {
        this.weblog = weblog;
    }

    public double getIcrjg() {
        return icrjg;
    }

    public void setIcrjg(double icrjg) {
        this.icrjg = icrjg;
    }

    public double getIxhjg() {
        return ixhjg;
    }

    public void setIxhjg(double ixhjg) {
        this.ixhjg = ixhjg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
