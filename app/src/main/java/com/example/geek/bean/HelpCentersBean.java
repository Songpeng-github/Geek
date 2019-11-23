package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:30
 */
public class HelpCentersBean {

    /**
     * code : 1
     * data : [{"createBy":"","createTime":null,"id":"13","isDeleted":"","list":null,"sort":1,"updateBy":"","updateTime":null,"version":0,"workId":"77","workTitle":"如实描述"},{"createBy":"","createTime":null,"id":"14","isDeleted":"","list":null,"sort":2,"updateBy":"","updateTime":null,"version":0,"workId":"78","workTitle":"成交必卖"},{"createBy":"","createTime":null,"id":"9","isDeleted":"","list":null,"sort":3,"updateBy":"","updateTime":null,"version":0,"workId":"70","workTitle":"竞拍流程"},{"createBy":"","createTime":null,"id":"15","isDeleted":"","list":null,"sort":4,"updateBy":"","updateTime":null,"version":0,"workId":"79","workTitle":"拍前预展"},{"createBy":"","createTime":null,"id":"10","isDeleted":"","list":null,"sort":5,"updateBy":"","updateTime":null,"version":0,"workId":"71","workTitle":"拍卖规则"},{"createBy":"","createTime":null,"id":"16","isDeleted":"","list":null,"sort":6,"updateBy":"","updateTime":null,"version":0,"workId":"72","workTitle":"常见问题"}]
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
         * createBy :
         * createTime : null
         * id : 13
         * isDeleted :
         * list : null
         * sort : 1
         * updateBy :
         * updateTime : null
         * version : 0
         * workId : 77
         * workTitle : 如实描述
         */

        private String createBy;
        private Object createTime;
        private String id;
        private String isDeleted;
        private Object list;
        private int sort;
        private String updateBy;
        private Object updateTime;
        private int version;
        private String workId;
        private String workTitle;

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

        public Object getList() {
            return list;
        }

        public void setList(Object list) {
            this.list = list;
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

        public String getWorkId() {
            return workId;
        }

        public void setWorkId(String workId) {
            this.workId = workId;
        }

        public String getWorkTitle() {
            return workTitle;
        }

        public void setWorkTitle(String workTitle) {
            this.workTitle = workTitle;
        }
    }
}
