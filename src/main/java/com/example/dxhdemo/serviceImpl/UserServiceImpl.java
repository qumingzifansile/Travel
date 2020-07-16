package com.example.dxhdemo.serviceImpl;

import com.example.dxhdemo.bean.Guest;
import com.example.dxhdemo.mapper.GuestMapper;
import com.example.dxhdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private GuestMapper guestMapper;

    @Override
    //获取用户信息
    public Guest getGuestInfo(String phonenumber) {
        return guestMapper.findGuestByTelephone(phonenumber);
    }

    @Override
    //获取所有用户
    public List<Guest> getAllGuests() {
        return guestMapper.findAllGuest();
    }

}
