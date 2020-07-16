package com.example.dxhdemo.service;

import com.example.dxhdemo.bean.Guest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    Guest getGuestInfo(String phonenumber);
    List<Guest> getAllGuests();
}
