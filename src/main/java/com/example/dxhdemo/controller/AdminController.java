package com.example.dxhdemo.controller;

import com.example.dxhdemo.bean.Guestbook;
import com.example.dxhdemo.bean.Guestyd;
import com.example.dxhdemo.bean.Line;
import com.example.dxhdemo.bean.Views;
import com.example.dxhdemo.mapper.LineMapper;
import com.example.dxhdemo.service.GuestbookService;
import com.example.dxhdemo.service.GuestydService;
import com.example.dxhdemo.service.LineService;
import com.example.dxhdemo.service.ViewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    LineService lineService;

    @Resource
    GuestydService guestydService;

    @Resource
    ViewsService viewsService;

    @Resource
    GuestbookService guestbookService;

    //查询所有线路记录(包含结束的
    @RequestMapping("/admin/getAllLines")
    public List<Line> getAllLines(){
        return lineService.findAllLines();
    }

    //修改单条记录
    @RequestMapping("/admin/changeOneLine")
    public int changeOneLineByTno(@RequestParam("tno") String tno,@RequestParam("xlname") String xlname,
                             @RequestParam("tj") String tj,@RequestParam("dengji") String dengji,
                             @RequestParam("xltype") String xltype,@RequestParam("xldate") Timestamp xldate,
                             @RequestParam("ts") int ts,@RequestParam("zrs") int zrs,
                             @RequestParam("dijie") String dijie,@RequestParam("qp") String qp,
                             @RequestParam("dp") String dp,@RequestParam("start") String start,
                             @RequestParam("jzd") String jzd,@RequestParam("sz") String sz,
                             @RequestParam("fc") String fc,@RequestParam("jz") String jz,
                             @RequestParam("cfd") String cfd,@RequestParam("ddd") String ddd,
                             @RequestParam("crxrs") int crxrs,@RequestParam("xhxrs") int xhxrs,
                             @RequestParam("xingchen") String xingchen,@RequestParam("xcap") String xcap,
                             @RequestParam("xcbz") String xcbz,@RequestParam("xcsm") String xcsm,
                             @RequestParam("lxfs") String lxfs,@RequestParam("bak") String bak,
                             @RequestParam("travel_bh") int travel_bh,@RequestParam("travel_name") String travel_name,
                             @RequestParam("status") String status,@RequestParam("tp1js") String tp1js,
                             @RequestParam("tp2js") String tp2js,@RequestParam("xgxl") String xgxl,
                             @RequestParam("views") String views,@RequestParam("weblog") String weblog,
                             @RequestParam("icrjg") double icrjg,@RequestParam("ixhjg") double ixhjg,
                             @RequestParam("state") int state){
        return lineService.changeOneLineByTno(tno,xlname,tj,dengji,xltype,xldate,ts,zrs,
                                        dijie,qp,dp,start,jzd,sz,fc,jz,cfd,ddd,crxrs,xhxrs,
                                        xingchen,xcap,xcbz,xcsm,lxfs,bak,travel_bh,travel_name,
                                        status,tp1js,tp2js,xgxl,views,weblog,icrjg,ixhjg,state);
    }
    //修改单条记录
    @RequestMapping
    public int changeOneLineById(@RequestParam("id")int id,@RequestParam("tno") String tno,
                                 @RequestParam("xlname") String xlname,
                                 @RequestParam("tj") String tj,@RequestParam("dengji") String dengji,
                                 @RequestParam("xltype") String xltype,@RequestParam("xldate") Timestamp xldate,
                                 @RequestParam("ts") int ts,@RequestParam("zrs") int zrs,
                                 @RequestParam("dijie") String dijie,@RequestParam("qp") String qp,
                                 @RequestParam("dp") String dp,@RequestParam("start") String start,
                                 @RequestParam("jzd") String jzd,@RequestParam("sz") String sz,
                                 @RequestParam("fc") String fc,@RequestParam("jz") String jz,
                                 @RequestParam("cfd") String cfd,@RequestParam("ddd") String ddd,
                                 @RequestParam("crxrs") int crxrs,@RequestParam("xhxrs") int xhxrs,
                                 @RequestParam("xingchen") String xingchen,@RequestParam("xcap") String xcap,
                                 @RequestParam("xcbz") String xcbz,@RequestParam("xcsm") String xcsm,
                                 @RequestParam("lxfs") String lxfs,@RequestParam("bak") String bak,
                                 @RequestParam("travel_bh") int travel_bh,@RequestParam("travel_name") String travel_name,
                                 @RequestParam("status") String status,@RequestParam("tp1js") String tp1js,
                                 @RequestParam("tp2js") String tp2js,@RequestParam("xgxl") String xgxl,
                                 @RequestParam("views") String views,@RequestParam("weblog") String weblog,
                                 @RequestParam("icrjg") double icrjg,@RequestParam("ixhjg") double ixhjg,
                                 @RequestParam("state") int state){
        return lineService.changeOneLineById(id,tno,xlname,tj,dengji,xltype,xldate,ts,zrs,
                dijie,qp,dp,start,jzd,sz,fc,jz,cfd,ddd,crxrs,xhxrs,
                xingchen,xcap,xcbz,xcsm,lxfs,bak,travel_bh,travel_name,
                status,tp1js,tp2js,xgxl,views,weblog,icrjg,ixhjg,state);
    }

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
    public int deleteOneGuestyd(@RequestParam("id")int id){
        return guestydService.deleteOneGuestyd(id);
    }

    //修改一条订单记录
    @RequestMapping("/admin/changeOneGuestyd")
    public int changeOneGuestyd(@RequestParam("id") int id,@RequestParam("uid") int uid,
                                @RequestParam("tno") String tno,@RequestParam("guestname") String guestname,
                                @RequestParam("tel") String tel,@RequestParam("crs") int crs,
                                @RequestParam("xhs") int xhs,@RequestParam("ydrq") Timestamp ydrq,
                                @RequestParam("bah") String bah,@RequestParam("state") int state){
        return guestydService.changeOneGuestyd(id,uid,tno,guestname,tel,crs,xhs,ydrq,bah,state);
    }

    //查询所有景点信息
    @RequestMapping("/admin/getAllViews")
    public List<Views> getAllViews(){
        return viewsService.findAllViews();
    }
    //删除一条景点信息
    @RequestMapping("/admin/deleteOneView")
    public int deleteOneView(int id){
        return viewsService.deleteOneView(id);
    }
    //修改一条景点信息
    @RequestMapping("/admin/changeOneView")
    public int changeOneView(@RequestParam("id")int id,@RequestParam("view") String view,
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
    public int deleteOneGuestbook(@RequestParam("id") int id){
        return guestbookService.deleteOneGuestbook(id);
    }
}
