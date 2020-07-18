package com.example.dxhdemo.tools;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeTools {
    public Timestamp getCurrentTimeStamp(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return Timestamp.valueOf(sdf.format(System.currentTimeMillis()));
    }

    public Timestamp toTimestamp(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return Timestamp.valueOf(simpleDateFormat.format(date));
    }

    public Date toDate(Timestamp timestamp){
        return new Date(timestamp.getTime());
    }

    public String timetoString(String time){
        return time.replace("-","").replace(" ","").replace(":","").replace(".","");
    }
}
