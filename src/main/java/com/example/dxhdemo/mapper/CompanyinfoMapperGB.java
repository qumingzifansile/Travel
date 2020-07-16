package com.example.dxhdemo.mapper;

import com.example.dxhdemo.bean.Companyinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyinfoMapperGB {

    List<Companyinfo> getAll();

    Companyinfo login(String RegPhone, String password);

    void reg(String Password, String About, String Title, String Description, String Keywords, String PhoneNumber,
             String Address, String RegPhone);

    void update(long CompanyID,String Password, String About, String Title, String Description, String Keywords, String PhoneNumber,
                String Address, String RegPhone);

    Companyinfo getMyInfo(long CompanyID);

}
