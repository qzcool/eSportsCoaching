package com.esports.web.model;

/**
 * Description:
 * Author: XJD
 * Date: 2017/12/23
 */
public class UserProfile {
    private String userid;
    private String nickname;
    private String img;
    private String game_label;
    private String introduction;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getGame_label() {
        return game_label;
    }

    public void setGame_label(String game_label) {
        this.game_label = game_label;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
