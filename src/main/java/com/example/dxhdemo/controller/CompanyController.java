package com.example.dxhdemo.controller;


import com.example.dxhdemo.bean.Companyinfo;
import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.service.CompanyService;
import com.example.dxhdemo.service.InfoService;
import com.example.dxhdemo.tools.MyTimeTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @Resource
    private InfoService infoService;

    private long CompanyID=-1;
    private Companyinfo companyinfo;

    //公司登录
    @RequestMapping("/company/login")
    public int loginCompany(@RequestParam("RegPhone")String RegPhone, @RequestParam("password")String password){
        companyinfo = companyService.login(RegPhone, password);
        if (companyinfo!=null) {
            CompanyID = companyinfo.getCompanyId();
            return 1;
        }
        else
            return 0;
    };

    //公司退出登录
    @RequestMapping("/company/quit")
    public int quitlogin(){
        CompanyID = -1;
        companyinfo = null;
        return 1;
    }

    //公司注册
    @RequestMapping("/company/reg")
    public int reg(@RequestParam("Password")String Password, @RequestParam("About")String About,
                   @RequestParam("Title")String Title, @RequestParam("Description")String Description,
                   @RequestParam("Keywords")String Keywords, @RequestParam("PhoneNumber")String PhoneNumber,
                   @RequestParam("Address")String Address, @RequestParam("RegPhone")String RegPhone){
        companyService.reg(Password, About, Title, Description, Keywords, PhoneNumber, Address, RegPhone);
        return 1;
    }

    //公司发布新的线路信息
    @RequestMapping("/company/publine")
    public int publine(@RequestParam("tno")String tno, @RequestParam("xlname")String xlname,@RequestParam("tj")String tj,
                       @RequestParam("dengji")String dengji,@RequestParam("xltype")String xltype,
                       @RequestParam("ts")long ts, @RequestParam("zrs")long zrs, @RequestParam("dijie")String dijie,
                       @RequestParam("qp")String qp,@RequestParam("dp")String dp,@RequestParam("start")String start,
                       @RequestParam("jzd")String jzd,@RequestParam("sz")String sz,@RequestParam("fc")String fc,
                       @RequestParam("jz")String jz, @RequestParam("cfd")String cfd, @RequestParam("ddd")String ddd,
                       @RequestParam("crxrs")String crxrs,@RequestParam("xhxrs")String xhxrs,@RequestParam("xingchen")String xingchen,
                       @RequestParam("xcap")String xcap,@RequestParam("xcbz")String xcbz,@RequestParam("xcsm")String xcsm,
                       @RequestParam("lxfs")String lxfs, @RequestParam("bak")String bak,@RequestParam("Travel_bh")long Travel_bh,
                       @RequestParam("Travel_name")String Travel_name,@RequestParam("status")String status,@RequestParam("tp1js")String tp1js,
                       @RequestParam("tp2js")String tp2js, @RequestParam("xgxl")String xgxl, @RequestParam("views")String views,
                       @RequestParam("weblog")String weblog,@RequestParam("icrjg")double icrjg,@RequestParam("ixhjg")double ixhjg,
                       @RequestParam("state")long state){
        if (CompanyID!=-1){
            companyService.publine(CompanyID,tno, xlname, tj, dengji, xltype,ts, zrs, dijie, qp, dp, start, jzd, sz, fc, jz, cfd,
                    ddd, crxrs, xhxrs, xingchen, xcap, xcbz, xcsm, lxfs, bak, Travel_bh, Travel_name, status, tp1js, tp2js,
                    xgxl, views, weblog, icrjg, ixhjg, state);
            return 1;
        }else
            return 0;
    }

    //公司查询自己的线路信息
    @RequestMapping("/company/searchline")
    public List<Line> searchline(){
        if (CompanyID!=-1){
            return companyService.searchlinebycompany(CompanyID);
        }else
            return null;
    }

    //公司修改自己的属性
    @RequestMapping("/company/update")
    public int updateInfo(@RequestParam("Password")String Password, @RequestParam("About")String About,
                          @RequestParam("Title")String Title, @RequestParam("Description")String Description,
                          @RequestParam("Keywords")String Keywords, @RequestParam("PhoneNumber")String PhoneNumber,
                          @RequestParam("Address")String Address, @RequestParam("RegPhone")String RegPhone){
        if (CompanyID!=-1) {
            companyService.updateCompany(CompanyID, Password, About, Title, Description, Keywords, PhoneNumber, Address,
                    RegPhone);
            return 1;
        }else
            return 0;
    }

    //公司查询自己的属性
    @RequestMapping("/company/getinfo")
    public Companyinfo getInfo(){
        if (CompanyID!=-1){
            return companyService.getInfo(CompanyID);
        }else
            return null;
    }

    //发布新闻
    @RequestMapping("/company/pubnews")
    public int pubNews(String views, String title, String show){
        infoService.pubNews(infoService.getViews(views).getId(), title, show, new MyTimeTools().getCurrentTimeStamp());
        return 1;
    }

}
