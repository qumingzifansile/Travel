package com.example.dxhdemo.bean;


public class Lineview {

  private String tno;
  private long views;
  private java.sql.Timestamp ctdate;


  public String getTno() {
    return tno;
  }

  public void setTno(String tno) {
    this.tno = tno;
  }


  public long getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }


  public java.sql.Timestamp getCtdate() {
    return ctdate;
  }

  public void setCtdate(java.sql.Timestamp ctdate) {
    this.ctdate = ctdate;
  }

}
