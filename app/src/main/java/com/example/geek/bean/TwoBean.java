package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/22
 * Time:18:35
 */
public class TwoBean {

    /**
     * code : 1
     * data : [{"accountId":0,"code":"182","createBy":"","createdate":null,"guaranteeprice":0,"isDeleted":"","isUser":"0","level":2,"list":null,"name":"全品类","oneCode":0,"oneName":"","parentcode":"181","soft":0,"sumPrice":0,"twoCode":0,"twoName":"","updateBy":"","updateDate":"","version":0}]
     * msg : success
     */

    private String code;
    private String msg;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * accountId : 0
         * code : 182
         * createBy :
         * createdate : null
         * guaranteeprice : 0
         * isDeleted :
         * isUser : 0
         * level : 2
         * list : null
         * name : 全品类
         * oneCode : 0
         * oneName :
         * parentcode : 181
         * soft : 0
         * sumPrice : 0
         * twoCode : 0
         * twoName :
         * updateBy :
         * updateDate :
         * version : 0
         */

        private int accountId;
        private String code;
        private String createBy;
        private Object createdate;
        private int guaranteeprice;
        private String isDeleted;
        private String isUser;
        private int level;
        private Object list;
        private String name;
        private int oneCode;
        private String oneName;
        private String parentcode;
        private int soft;
        private int sumPrice;
        private int twoCode;
        private String twoName;
        private String updateBy;
        private String updateDate;
        private int version;

        public int getAccountId() {
            return accountId;
        }

        public void setAccountId(int accountId) {
            this.accountId = accountId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public Object getCreatedate() {
            return createdate;
        }

        public void setCreatedate(Object createdate) {
            this.createdate = createdate;
        }

        public int getGuaranteeprice() {
            return guaranteeprice;
        }

        public void setGuaranteeprice(int guaranteeprice) {
            this.guaranteeprice = guaranteeprice;
        }

        public String getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(String isDeleted) {
            this.isDeleted = isDeleted;
        }

        public String getIsUser() {
            return isUser;
        }

        public void setIsUser(String isUser) {
            this.isUser = isUser;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public Object getList() {
            return list;
        }

        public void setList(Object list) {
            this.list = list;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOneCode() {
            return oneCode;
        }

        public void setOneCode(int oneCode) {
            this.oneCode = oneCode;
        }

        public String getOneName() {
            return oneName;
        }

        public void setOneName(String oneName) {
            this.oneName = oneName;
        }

        public String getParentcode() {
            return parentcode;
        }

        public void setParentcode(String parentcode) {
            this.parentcode = parentcode;
        }

        public int getSoft() {
            return soft;
        }

        public void setSoft(int soft) {
            this.soft = soft;
        }

        public int getSumPrice() {
            return sumPrice;
        }

        public void setSumPrice(int sumPrice) {
            this.sumPrice = sumPrice;
        }

        public int getTwoCode() {
            return twoCode;
        }

        public void setTwoCode(int twoCode) {
            this.twoCode = twoCode;
        }

        public String getTwoName() {
            return twoName;
        }

        public void setTwoName(String twoName) {
            this.twoName = twoName;
        }

        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }
    }
}
