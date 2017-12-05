package com.esports.web.model;

import java.sql.Timestamp;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
public class IdentifyCode {
    private String username;
    private String code;
    private Timestamp extime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Timestamp getExtime() {
        return extime;
    }

    public void setExtime(Timestamp extime) {
        this.extime = extime;
    }
}
