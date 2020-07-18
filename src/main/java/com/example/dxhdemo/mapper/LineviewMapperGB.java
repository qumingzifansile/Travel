package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Lineview;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;


@Mapper
public interface LineviewMapperGB {
    List<Lineview> getViews(String tno);

    List<Lineview> getTno(long views);

    void updateLineview(String tno, String views, Timestamp ctdae);

    Lineview searchbytnoandviews(String tno,long views);

    void addLineview(String tno,long views);
}
