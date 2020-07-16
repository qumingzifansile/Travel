package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guestyd;
import com.example.dxhdemo.mapper.GuestydMapper;
import com.example.dxhdemo.service.GuestydService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class GuestydServiceImpl implements GuestydService {

    @Resource
    private GuestydMapper guestydMapper;

    @Override
    //检索所有订单
    public List<Guestyd> findAllGuestyds() {
        return guestydMapper.findAllGuestyd();
    }

    @Override
    //删除订单
    public int deleteOneGuestyd(long id) {
        Guestyd guestyd = guestydMapper.findById(id);
        guestyd.setState(0);
        guestydMapper.save(guestyd);
        return 1;
    }

    @Override
    public int changeOneGuestyd(long id,long uid, String tno, String guestname, String tel, int crs, int xhs,
                                Timestamp ydrq, String bah, int state) {
        Guestyd guestyd = guestydMapper.findById(id);
        guestyd.setUid(uid);
        guestyd.setTno(tno);
        guestyd.setGuestname(guestname);
        guestyd.setTel(tel);
        guestyd.setCrs(crs);
        guestyd.setXhs(xhs);
        guestyd.setYdrq(ydrq);
        guestyd.setBah(bah);
        guestyd.setState(state);
        guestydMapper.save(guestyd);
        return 1;
    }
}
