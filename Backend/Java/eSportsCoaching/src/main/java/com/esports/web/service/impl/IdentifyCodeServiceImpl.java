package com.esports.web.service.impl;

import com.esports.constant.RegExConstant;
import com.esports.util.IdentifyCodeUtil;
import com.esports.web.dao.IdentifyCodeMapper;
import com.esports.web.model.IdentifyCode;
import com.esports.web.service.IIdentifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
@Service
public class IdentifyCodeServiceImpl implements IIdentifyCodeService {

    @Autowired
    private IdentifyCodeMapper identifyCodeMapper;

    @Autowired
    private EmailServiceImpl emailService;

    @Override
    public void sendIdentifyCode(String address) {

        IdentifyCode identifyCode = new IdentifyCode();

        String code = IdentifyCodeUtil.getVerifyCode();

        if (address.matches(RegExConstant.EMAIL_REG)) {
            emailService.sendEmail("aircraftbjtu@163.com", "邮件标题", code);
        } else if (address.matches(RegExConstant.PHONE_REG)) {
            //发短信验证码
        }
        identifyCode.setUsername(address);
        identifyCode.setCode(code);
        identifyCode.setExtime(new Timestamp(System.currentTimeMillis() + 2 * 60 * 1000));
        identifyCodeMapper.insertCode(identifyCode);
    }

    @Override
    public String getIdentifyCode(String username) {
        String code = identifyCodeMapper.selectByName(username);
        return code;
    }
}
