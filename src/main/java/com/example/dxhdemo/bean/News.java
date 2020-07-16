package com.example.dxhdemo.bean;


public class News {

  private long id;
  private String titile;
  private String show;
  private java.sql.Timestamp time;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitile() {
    return titile;
  }

  public void setTitile(String titile) {
    this.titile = titile;
  }


  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }

}
