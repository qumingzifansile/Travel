package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Travelview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TravelviewMapperGB {
    void pubTravelview(long companyid,String tno,String xlname,String dengji,String xltype,long ts,String xcap,String
            xcbz,String xcsm);

    List<Travelview> getMyTravelview(long companyid);

    List<Travelview> getCompanyid(String tno);

    void updateTravelview(long companyid,String tno,String xlname,String dengji,String xltype,long ts,String xcap,String
            xcbz,String xcsm);

    void delTravelview(String tno);
}
