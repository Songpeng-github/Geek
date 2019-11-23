package com.example.geek.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:42
 */
public class WorkManagementBean {

    /**
     * code : 1
     * data : {"createBy":"","createTime":"2019-09-26 09:59:48","id":"69","isDeleted":"0","sort":1,"updateBy":"guanzihao","updateTime":"2019-10-23 13:50:36","version":0,"workContent":"<p><span style=\"font-size: 16px; color: rgb(68, 68, 68);\">第一步  在未登录情况下，点击鹊拍首页左上角【注册】按钮。<\/span><\/p><p><span style=\"font-size: 16px; color: rgb(68, 68, 68);\">第二步&nbsp; 选择个人注册或企业注册，然后根据页面提示，输入手机号进行短信验证。<\/span><\/p><p><span style=\"font-size: 16px; color: rgb(68, 68, 68);\">第三步&nbsp; 根据页面提示填写账号信息（企业需填写公司信息）。<\/span><\/p><p><span style=\"font-size: 16px; color: rgb(68, 68, 68);\">第四步 &nbsp;注册成功，跳转登录页进行登录。<\/span><span style=\"font-size: 14px; color: rgb(68, 68, 68);\">﻿<\/span><\/p>","workTitle":"注册流程","workType":"1"}
     * msg : success
     */

    private String code;
    private DataBean data;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * createBy :
         * createTime : 2019-09-26 09:59:48
         * id : 69
         * isDeleted : 0
         * sort : 1
         * updateBy : guanzihao
         * updateTime : 2019-10-23 13:50:36
         * version : 0
         * workContent : <p><span style="font-size: 16px; color: rgb(68, 68, 68);">第一步  在未登录情况下，点击鹊拍首页左上角【注册】按钮。</span></p><p><span style="font-size: 16px; color: rgb(68, 68, 68);">第二步&nbsp; 选择个人注册或企业注册，然后根据页面提示，输入手机号进行短信验证。</span></p><p><span style="font-size: 16px; color: rgb(68, 68, 68);">第三步&nbsp; 根据页面提示填写账号信息（企业需填写公司信息）。</span></p><p><span style="font-size: 16px; color: rgb(68, 68, 68);">第四步 &nbsp;注册成功，跳转登录页进行登录。</span><span style="font-size: 14px; color: rgb(68, 68, 68);">﻿</span></p>
         * workTitle : 注册流程
         * workType : 1
         */

        private String createBy;
        private String createTime;
        private String id;
        private String isDeleted;
        private int sort;
        private String updateBy;
        private String updateTime;
        private int version;
        private String workContent;
        private String workTitle;
        private String workType;

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getWorkContent() {
            return workContent;
        }

        public void setWorkContent(String workContent) {
            this.workContent = workContent;
        }

        public String getWorkTitle() {
            return workTitle;
        }

        public void setWorkTitle(String workTitle) {
            this.workTitle = workTitle;
        }

        public String getWorkType() {
            return workType;
        }

        public void setWorkType(String workType) {
            this.workType = workType;
        }
    }
}
