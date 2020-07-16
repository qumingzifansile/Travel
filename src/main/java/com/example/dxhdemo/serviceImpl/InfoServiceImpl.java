package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guestbook;
import com.example.dxhdemo.bean.News;
import com.example.dxhdemo.bean.Views;
import com.example.dxhdemo.mapper.*;
import com.example.dxhdemo.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Resource
    private NewsMapperGB newsMapperGB;

    @Resource
    private ViewsMapperGB viewsMapperGB;

    @Resource
    private GuestbookMapperGB guestbookMapperGB;


    @Override
    public List<News> getInfobyID(long id) {
        return newsMapperGB.getInfo(id);
    }

    @Override
    public void pubNews(long id, String title, String show, Timestamp time) {
        newsMapperGB.pubNews(id, title, show, time);
    }

    @Override
    public Views getViews(String view) {
        return viewsMapperGB.getInfobyview(view);
    }

    @Override
    public List<Guestbook> getGuestbook() {
        return guestbookMapperGB.getAll();
    }
}
