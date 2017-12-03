package com.esports.web.service;

import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: XJD
 * Date: 2017/11/24
 */
public interface IEmailService {

    void sendEmail(String contacts, String subject, String content);
}
