package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Views;
import com.example.dxhdemo.mapper.ViewsMapper;
import com.example.dxhdemo.service.ViewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.text.View;
import java.util.List;

@Service
public class ViewsServiceImpl implements ViewsService {

    @Resource
    private ViewsMapper viewsMapper;

    @Override
    public List<Views> findAllViews() {
        return viewsMapper.findAllViews();
    }

    @Override
    //删除
    public int deleteOneView(int id) {
        viewsMapper.deleteById(id);
        return 1;
    }

    @Override
    //修改一个景点信息
    public int changeOneView(int id,String view,String imageUrl,String content,String city) {
        Views oldView = viewsMapper.findById(id);
        oldView.setView(view);
        oldView.setImageUrl(imageUrl);
        oldView.setContent(content);
        oldView.setCity(city);
        viewsMapper.save(oldView);
        return 1;
    }

    @Override
    //根据城市获取景点
    public List<Views> findSomeViews(String city) {
        return viewsMapper.findByCity(city);
    }
}
