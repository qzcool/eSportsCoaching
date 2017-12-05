package com.esports.util;

import java.util.Random;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/05
 */
public class IdentifyCodeUtil {
    public static String getVerifyCode() {
        String[] verifyString = new String[] { "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9","A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L",
                "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};
        Random random = new Random(System.currentTimeMillis());
        StringBuilder verifyBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int rd = random.nextInt(33);
            verifyBuilder.append(verifyString[rd]);
        }
        String verifyCode = verifyBuilder.toString();
        return verifyCode;
    }
}
