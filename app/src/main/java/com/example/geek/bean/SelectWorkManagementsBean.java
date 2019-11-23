package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:21
 */
public class SelectWorkManagementsBean {

    /**
     * code : 1
     * data : [{"currentPage":1,"id":"69","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"注册流程","workType":"1"},{"currentPage":1,"id":"70","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"竞拍流程","workType":"1"},{"currentPage":1,"id":"71","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"拍卖规则","workType":"1"},{"currentPage":1,"id":"72","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"常见问题","workType":"1"},{"currentPage":1,"id":"73","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"报名交保证金","workType":"2"},{"currentPage":1,"id":"74","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"大额支付说明","workType":"2"},{"currentPage":1,"id":"75","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"保证金退还","workType":"2"},{"currentPage":1,"id":"76","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"尾款支付","workType":"2"},{"currentPage":1,"id":"77","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"如实描述","workType":"4"},{"currentPage":1,"id":"78","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"成交必卖","workType":"4"},{"currentPage":1,"id":"79","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"拍前预展","workType":"4"},{"currentPage":1,"id":"80","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"商家保障金","workType":"4"},{"currentPage":1,"id":"81","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"入驻标准","workType":"3"},{"currentPage":1,"id":"82","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"入驻流程","workType":"3"},{"currentPage":1,"id":"83","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"资费标准","workType":"3"},{"currentPage":1,"id":"84","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"发拍流程","workType":"3"},{"currentPage":1,"id":"85","isDeleted":"","pageSize":10,"sort":0,"updateTime":null,"workTitle":"特殊功能说明","workType":"3"}]
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
         * currentPage : 1
         * id : 69
         * isDeleted :
         * pageSize : 10
         * sort : 0
         * updateTime : null
         * workTitle : 注册流程
         * workType : 1
         */

        private int currentPage;
        private String id;
        private String isDeleted;
        private int pageSize;
        private int sort;
        private Object updateTime;
        private String workTitle;
        private String workType;

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
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

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
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
