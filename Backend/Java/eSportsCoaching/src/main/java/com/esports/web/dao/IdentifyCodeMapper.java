package com.esports.web.dao;

import com.esports.web.model.IdentifyCode;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
public interface IdentifyCodeMapper {

    void insertCode(IdentifyCode code);

    String selectByName(String username);

}
