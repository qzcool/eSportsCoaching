package com.esports.util;

import java.util.Random;
import java.util.UUID;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/23
 */
public class UUIDGenerator {
    /**
     * 生成唯一的用户ID
     *
     * @return
     */
    public static String generateUserId() {
        int prefix = new Random().nextInt(9) + 1;
        int tail = UUID.randomUUID().toString().hashCode();
        if (tail < 0) {
            tail = -tail;
        }
        return prefix + String.format("%011d", tail);
    }

    /**
     * 生成唯一的游戏id
     *
     * @return
     */
    public static String generateGameId() {
        String prefix = "game_";
        int tail = UUID.randomUUID().toString().hashCode();
        if (tail < 0) {
            tail = -tail;
        }
        return prefix + String.format("%011d", tail);
    }

    /**
     * 生成唯一的订单id
     *
     * @return
     */
    public static String generateOrderId() {
        String prefix = "order_";
        int tail = UUID.randomUUID().toString().hashCode();
        if (tail < 0) {
            tail = -tail;
        }
        return prefix + String.format("%011d", tail);
    }

    public static void main(String[] args) {
        System.out.println(generateGameId());
    }
}
