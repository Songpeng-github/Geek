package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/22
 * Time:14:14
 */
public class BannerBean {

    /**
     * code : 1
     * data : [{"bannerUrl":"http://file.quepai.cn//banner1.jpg","createBy":"","createTime":null,"id":"45","isDeleted":"","sort":1,"updateBy":"","updateTime":null,"version":0},{"bannerUrl":"http://file.quepai.cn//banner01.jpg","createBy":"","createTime":null,"id":"46","isDeleted":"","sort":2,"updateBy":"","updateTime":null,"version":0},{"bannerUrl":"http://file.quepai.cn//banner3.jpg","createBy":"","createTime":null,"id":"47","isDeleted":"","sort":3,"updateBy":"","updateTime":null,"version":0},{"bannerUrl":"http://file.quepai.cn//banner4.jpg","createBy":"","createTime":null,"id":"48","isDeleted":"","sort":4,"updateBy":"","updateTime":null,"version":0}]
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
         * bannerUrl : http://file.quepai.cn//banner1.jpg
         * createBy :
         * createTime : null
         * id : 45
         * isDeleted :
         * sort : 1
         * updateBy :
         * updateTime : null
         * version : 0
         */

        private String bannerUrl;
        private String createBy;
        private Object createTime;
        private String id;
        private String isDeleted;
        private int sort;
        private String updateBy;
        private Object updateTime;
        private int version;

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
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

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }
    }
}
