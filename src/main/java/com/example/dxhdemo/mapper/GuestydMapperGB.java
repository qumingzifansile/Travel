package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Guestyd;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface GuestydMapperGB {
    void guestYd(long uid, String tno, String guestname, String tel, long crs, long xhs, Timestamp ydrq,String bah);
    List<Guestyd> getTnoInfo(long uid);
    List<Guestyd> getUidInfo(String tno);
}
