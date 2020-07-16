package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Lineview;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface LineviewMapperGB {
    List<Lineview> getViews(String tno);

    List<Lineview> getTno(String views);

    void updateLineview(String tno, String views, Timestamp ctdae);

    Lineview searchbytnoandviews(String tno,String views);

    void addLineview(String tno,String views);
}
