package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guestbook;
import com.example.dxhdemo.mapper.GuestbookMapper;
import com.example.dxhdemo.service.GuestbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GuestbookImpl implements GuestbookService {

    @Resource
    private GuestbookMapper guestbookMapper;

    @Override
    //获取所有留言
    public List<Guestbook> findAllGuestbooks() {
        return guestbookMapper.findAll();
    }

    @Override
    //获取30天内的留言
    public List<Guestbook> findSomeGuestbooks() {
        return guestbookMapper.findSome();
    }

    @Override
    //删除
    public int deleteOneGuestbook(int id) {
        guestbookMapper.deleteById(id);
        return 1;
    }
}
