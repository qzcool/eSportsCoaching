package com.esports.web.service;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
public interface IIdentifyCodeService {
    void sendIdentifyCode(String address);
    String getIdentifyCode(String username);
}
