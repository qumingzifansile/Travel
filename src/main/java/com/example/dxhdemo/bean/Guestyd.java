package com.example.dxhdemo.bean;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name= "guestyd")
public class Guestyd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private long uid;
    private String tno;
    private String guestname;
    private String tel;
    private int crs;
    private int xhs;
    private Timestamp ydrq;
    private String bah;
    private int state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCrs() {
        return crs;
    }

    public void setCrs(int crs) {
        this.crs = crs;
    }

    public int getXhs() {
        return xhs;
    }

    public void setXhs(int xhs) {
        this.xhs = xhs;
    }

    public Timestamp getYdrq() {
        return ydrq;
    }

    public void setYdrq(Timestamp ydrq) {
        this.ydrq = ydrq;
    }

    public String getBah() {
        return bah;
    }

    public void setBah(String bah) {
        this.bah = bah;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
