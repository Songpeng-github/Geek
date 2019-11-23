package com.example.geek.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:35
 */
public class BasicSettingBean {

    /**
     * code : 1
     * data : {"createBy":"guanzihao","createTime":"2019-09-25 19:01:19","custMobile":"400-8383-686","id":"2","isDeleted":"","shopHead":"https://www.quepai.cn//images/20191104/20191104184254585.png","updateBy":"","updateTime":"2019-11-04 18:42:59","userHead":"https://www.quepai.cn//images/20191104/20191104184251325.png","version":1}
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
         * createBy : guanzihao
         * createTime : 2019-09-25 19:01:19
         * custMobile : 400-8383-686
         * id : 2
         * isDeleted :
         * shopHead : https://www.quepai.cn//images/20191104/20191104184254585.png
         * updateBy :
         * updateTime : 2019-11-04 18:42:59
         * userHead : https://www.quepai.cn//images/20191104/20191104184251325.png
         * version : 1
         */

        private String createBy;
        private String createTime;
        private String custMobile;
        private String id;
        private String isDeleted;
        private String shopHead;
        private String updateBy;
        private String updateTime;
        private String userHead;
        private int version;

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

        public String getCustMobile() {
            return custMobile;
        }

        public void setCustMobile(String custMobile) {
            this.custMobile = custMobile;
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

        public String getShopHead() {
            return shopHead;
        }

        public void setShopHead(String shopHead) {
            this.shopHead = shopHead;
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

        public String getUserHead() {
            return userHead;
        }

        public void setUserHead(String userHead) {
            this.userHead = userHead;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }
    }
}
