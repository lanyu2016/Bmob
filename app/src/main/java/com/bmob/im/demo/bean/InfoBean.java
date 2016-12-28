package com.bmob.im.demo.bean;

import java.io.File;

import cn.bmob.v3.BmobObject;

/**
 * Created by Eson on 2016/12/9.
 */
public class InfoBean extends BmobObject {
    private String tv_info_title;
    private String tv_info_message;
    private File iv_info_picture;
    private String objectId;


    public InfoBean(String tv_info_title, String tv_info_message, File iv_info_picture, String objectId) {
        this.tv_info_title = tv_info_title;
        this.tv_info_message = tv_info_message;
        this.iv_info_picture = iv_info_picture;
        this.objectId = objectId;

    }


    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getTv_info_title() {
        return tv_info_title;
    }

    public void setTv_info_title(String tv_info_title) {
        this.tv_info_title = tv_info_title;
    }

    public String getTv_info_message() {
        return tv_info_message;
    }

    public void setTv_info_message(String tv_info_message) {
        this.tv_info_message = tv_info_message;
    }

    public File getIv_info_picture() {
        return iv_info_picture;
    }

    public void setIv_info_picture(File iv_info_picture) {
        this.iv_info_picture = iv_info_picture;
    }
}
