package com.esports.web.service.impl;

import com.esports.web.dao.GamerMapper;
import com.esports.web.model.UserProfile;
import com.esports.web.service.IGamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Description:
 * Author: XJD
 * Date: 2018/01/02
 */
@Service
public class GamerService implements IGamerService{

    @Autowired
    private GamerMapper gamerMapper;

    @Override
    public void updateProfile(UserProfile profile) {

    }
}
