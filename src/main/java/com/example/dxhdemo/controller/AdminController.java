package com.example.dxhdemo.controller;

import com.example.dxhdemo.bean.*;
import com.example.dxhdemo.mapper.LineMapper;
import com.example.dxhdemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class AdminController {

    @Autowired
    LineService lineService;

    @Resource
    GuestydService guestydService;

    @Resource
    ViewsService viewsService;

    @Resource
    GuestbookService guestbookService;

    @Resource
    GuestService guestService;

    @Resource
    CompanyService companyService;

    //查询所有线路记录(包含结束的
    @RequestMapping("/admin/getAllLines")
    public List<Line> getAllLines(){
        return lineService.findAllLines();
    }

    //修改单条记录
//    @RequestMapping("/admin/changeOneLineByTno")
//    public int changeOneLineByTno(@RequestParam("tno") String tno,@RequestParam("xlname") String xlname,
//                             @RequestParam("tj") String tj,@RequestParam("dengji") String dengji,
//                             @RequestParam("xltype") String xltype,@RequestParam("xldate") Timestamp xldate,
//                             @RequestParam("ts") int ts,@RequestParam("zrs") int zrs,
//                             @RequestParam("dijie") String dijie,@RequestParam("qp") String qp,
//                             @RequestParam("dp") String dp,@RequestParam("start") String start,
//                             @RequestParam("jzd") String jzd,@RequestParam("sz") String sz,
//                             @RequestParam("fc") String fc,@RequestParam("jz") String jz,
//                             @RequestParam("cfd") String cfd,@RequestParam("ddd") String ddd,
//                             @RequestParam("crxrs") int crxrs,@RequestParam("xhxrs") int xhxrs,
//                             @RequestParam("xingchen") String xingchen,@RequestParam("xcap") String xcap,
//                             @RequestParam("xcbz") String xcbz,@RequestParam("xcsm") String xcsm,
//                             @RequestParam("lxfs") String lxfs,@RequestParam("bak") String bak,
//                             @RequestParam("travel_bh") int travel_bh,@RequestParam("travel_name") String travel_name,
//                             @RequestParam("status") String status,@RequestParam("tp1js") String tp1js,
//                             @RequestParam("tp2js") String tp2js,@RequestParam("xgxl") String xgxl,
//                             @RequestParam("views") String views,@RequestParam("weblog") String weblog,
//                             @RequestParam("icrjg") double icrjg,@RequestParam("ixhjg") double ixhjg,
//                             @RequestParam("state") int state){
//        return lineService.changeOneLineByTno(tno,xlname,tj,dengji,xltype,xldate,ts,zrs,
//                                        dijie,qp,dp,start,jzd,sz,fc,jz,cfd,ddd,crxrs,xhxrs,
//                                        xingchen,xcap,xcbz,xcsm,lxfs,bak,travel_bh,travel_name,
//                                        status,tp1js,tp2js,xgxl,views,weblog,icrjg,ixhjg,state);
//    }
    //修改单条记录
    @RequestMapping("/admin/changeOneLineByTno")
    public int changeOneLineByTno(@RequestBody Line line){
        return lineService.changeOneLineByTno(line.getTno(),line.getXlname(),line.getTj(),line.getDengji(),line.getXltype(),line.getXldate(),
                line.getTs(),line.getZrs(), line.getDijie(),line.getQp(),line.getDp(),line.getStart(),line.getJzd(),line.getSz()
                ,line.getFc(),line.getJz(),line.getCfd(),line.getDdd(),line.getCrxrs(),line.getXhxrs(),
                line.getXingchen(),line.getXcap(),line.getXcbz(),line.getXcsm(),line.getLxfs(),line.getBak(),line.getTravelBh(),line.getTravelName(),
                line.getStatus(),line.getTp1Js(),line.getTp2Js(),line.getXgxl(),line.getViews(),line.getWeblog(),line.getIcrjg(),line.getIxhjg()
                ,line.getState());
    }
    //修改单条记录
//    @RequestMapping("/admin/changeOneLineById")
//    public int changeOneLineById(@RequestParam("id")long id,@RequestParam("tno") String tno,
//                                 @RequestParam("xlname") String xlname,
//                                 @RequestParam("tj") String tj,@RequestParam("dengji") String dengji,
//                                 @RequestParam("xltype") String xltype,@RequestParam("xldate") Timestamp xldate,
//                                 @RequestParam("ts") int ts,@RequestParam("zrs") int zrs,
//                                 @RequestParam("dijie") String dijie,@RequestParam("qp") String qp,
//                                 @RequestParam("dp") String dp,@RequestParam("start") String start,
//                                 @RequestParam("jzd") String jzd,@RequestParam("sz") String sz,
//                                 @RequestParam("fc") String fc,@RequestParam("jz") String jz,
//                                 @RequestParam("cfd") String cfd,@RequestParam("ddd") String ddd,
//                                 @RequestParam("crxrs") int crxrs,@RequestParam("xhxrs") int xhxrs,
//                                 @RequestParam("xingchen") String xingchen,@RequestParam("xcap") String xcap,
//                                 @RequestParam("xcbz") String xcbz,@RequestParam("xcsm") String xcsm,
//                                 @RequestParam("lxfs") String lxfs,@RequestParam("bak") String bak,
//                                 @RequestParam("travel_bh") int travel_bh,@RequestParam("travel_name") String travel_name,
//                                 @RequestParam("status") String status,@RequestParam("tp1js") String tp1js,
//                                 @RequestParam("tp2js") String tp2js,@RequestParam("xgxl") String xgxl,
//                                 @RequestParam("views") String views,@RequestParam("weblog") String weblog,
//                                 @RequestParam("icrjg") double icrjg,@RequestParam("ixhjg") double ixhjg,
//                                 @RequestParam("state") int state){
//        return lineService.changeOneLineById(id,tno,xlname,tj,dengji,xltype,xldate,ts,zrs,
//                dijie,qp,dp,start,jzd,sz,fc,jz,cfd,ddd,crxrs,xhxrs,
//                xingchen,xcap,xcbz,xcsm,lxfs,bak,travel_bh,travel_name,
//                status,tp1js,tp2js,xgxl,views,weblog,icrjg,ixhjg,state);
//    }

    //删除一条线路记录
    @RequestMapping("/admin/deleteOneLine")
    public int deleteOneLine(@RequestParam("tno") String tno){
        return lineService.deleteOneLineByTno(tno);
    }

    //查询所有订单
    @RequestMapping("/admin/getAllGuestyds")
    public List<Guestyd> getAllGuestyds(){
        return guestydService.findAllGuestyds();
    }

    //删除一条订单记录
    @RequestMapping("/admin/deleteOneGuestyd")
    public int deleteOneGuestyd(@RequestParam("id")long id){
        return guestydService.deleteOneGuestyd(id);
    }

    //修改一条订单记录
    @RequestMapping("/admin/changeOneGuestyd")
    public int changeOneGuestyd(@RequestParam("id") long id,@RequestParam("uid") int uid,
                                @RequestParam("tno") String tno,@RequestParam("guestname") String guestname,
                                @RequestParam("tel") String tel,@RequestParam("crs") int crs,
                                @RequestParam("xhs") int xhs,@RequestParam("ydrq_s") String  ydrq_s,
                                @RequestParam("bah") String bah,@RequestParam("state") int state){
        return guestydService.changeOneGuestyd(id,uid,tno,guestname,tel,crs,xhs,Timestamp.valueOf(ydrq_s),bah,state);
    }
    //修改一条订单记录
    @RequestMapping("/admin/changeGuestyd")
    public int changeGuestyd(@RequestParam("id") long id,@RequestParam("uid") int uid,
                             @RequestParam("tno") String tno,@RequestParam("guestname") String guestname,
                             @RequestParam("tel") String tel,@RequestParam("crs") int crs,
                             @RequestParam("xhs") int xhs,
                             @RequestParam("bah") String bah,@RequestParam("state") int state){
        guestydService.changeGuestyd(id,uid,tno,guestname,tel,crs,xhs,bah,state);
        return 1;
    }
    //查询所有景点信息
    @RequestMapping("/admin/getAllViews")
    public List<Views> getAllViews(){
        return viewsService.findAllViews();
    }
    //删除一条景点信息
    @RequestMapping("/admin/deleteOneView")
    public int deleteOneView(long id){
        return viewsService.deleteOneView(id);
    }
    //修改一条景点信息
    @RequestMapping("/admin/changeOneView")
    public int changeOneView(@RequestParam("id")long id,@RequestParam("view") String view,
                             @RequestParam("imageUrl") String imageUrl,@RequestParam("content") String content,
                             @RequestParam("city") String city){
        return viewsService.changeOneView(id,view,imageUrl,content,city);
    }
    //查询部分景点信息
    @RequestMapping("/admin/getSomeViews")
    public List<Views> getSomeViews(@RequestParam("city") String city){
        return viewsService.findSomeViews(city);
    }

    //查询所有留言
    @RequestMapping("/admin/getAllGuestbooks")
    public List<Guestbook> getAllGuestbooks(){
        return guestbookService.findAllGuestbooks();
    }
    //获取30天内的留言
    @RequestMapping("/admin/getSomeGuestbooks")
    public List<Guestbook> getSomeGuestbooks(){
        return guestbookService.findSomeGuestbooks();
    }
    //删除留言
    @RequestMapping("/admin/deleteOneGuestbook")
    public int deleteOneGuestbook(@RequestParam("id") long id){
        return guestbookService.deleteOneGuestbook(id);
    }


    //获取所有企业用户信息
    @RequestMapping("/admin/getallcompany")
    public List<Companyinfo> getAllcompany(){
        return companyService.getAllinfo();
    }

    //删除企业用户信息
    @RequestMapping("/admin/delcompanyinfo")
    public int delCompaninfo(@RequestParam("companyId")long CompanyID){
        companyService.delInfo(CompanyID);
        return 1;
    }

    //修改企业用户信息
    @RequestMapping("/admin/updatecompanyinfo")
    public int updateCompanyinfo(@RequestParam("companyId")long CompanyID,@RequestParam("password")String Password,
                                 @RequestParam("about")String About, @RequestParam("title")String Title,
                                 @RequestParam("description")String Description, @RequestParam("keywords")String Keywords,
                                 @RequestParam("phoneNumber")String PhoneNumber, @RequestParam("address")String Address,
                                 @RequestParam("regPhone")String RegPhone){
        companyService.updateCompany(CompanyID, Password, About, Title, Description, Keywords, PhoneNumber, Address, RegPhone);
        return 1;
    }

    //获取所有用户信息
    @RequestMapping("/admin/getallguest")
    public List<Guest> getAllguest(){
        return guestService.getall();
    }

    //删除用户信息
    @RequestMapping("/admin/delguest")
    public int delGuest(@RequestParam("guestId")long GuestID){
        guestService.delguest(GuestID);
        return 1;
    }

    //修改用户信息
    @RequestMapping("/admin/updateguest")
    public int updateGuest(@RequestParam("guestId")long GuestID,@RequestParam("name")String name,
                           @RequestParam("pass")String pass,@RequestParam("sex")String sex,
                           @RequestParam("email")String email,@RequestParam("telephone")String telephone,
                           @RequestParam("idnumber")String idnumber,@RequestParam("address")String address){
        guestService.guestupdate(GuestID, name, pass, sex, email, telephone, idnumber,address);
        return 1;
    }


}
