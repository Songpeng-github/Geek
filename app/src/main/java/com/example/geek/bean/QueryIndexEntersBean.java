package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:28
 */
public class QueryIndexEntersBean {

    /**
     * code : 1
     * data : [{"createBy":"","createTime":null,"enterId":"19","guaranteePrice":10000,"id":"3","isDeleted":"","level":2,"list":null,"name":"轿车","parentCode":"18","sort":1,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"25","guaranteePrice":10000,"id":"4","isDeleted":"","level":2,"list":null,"name":"跑车","parentCode":"18","sort":2,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"91","guaranteePrice":10000,"id":"6","isDeleted":"","level":2,"list":null,"name":"债权","parentCode":"37","sort":3,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"89","guaranteePrice":10000,"id":"5","isDeleted":"","level":2,"list":null,"name":"股权","parentCode":"37","sort":4,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"203","guaranteePrice":1000,"id":"15","isDeleted":"","level":2,"list":null,"name":"手机","parentCode":"184","sort":5,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"220","guaranteePrice":1000,"id":"18","isDeleted":"","level":2,"list":null,"name":"电器","parentCode":"184","sort":6,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"205","guaranteePrice":1000,"id":"17","isDeleted":"","level":2,"list":null,"name":"数码","parentCode":"184","sort":7,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"162","guaranteePrice":10000,"id":"21","isDeleted":"","level":2,"list":null,"name":"奢侈品","parentCode":"93","sort":8,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"7","guaranteePrice":100000,"id":"2","isDeleted":"","level":2,"list":null,"name":"商业用房","parentCode":"1","sort":9,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"170","guaranteePrice":100,"id":"14","isDeleted":"","level":2,"list":null,"name":"扶贫拍卖","parentCode":"167","sort":10,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"73","guaranteePrice":2000,"id":"11","isDeleted":"","level":2,"list":null,"name":"农资产品","parentCode":"37","sort":11,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"52","guaranteePrice":1000,"id":"19","isDeleted":"","level":2,"list":null,"name":"机械设备","parentCode":"37","sort":12,"updateBy":"","updateTime":null,"version":0},{"createBy":"","createTime":null,"enterId":"149","guaranteePrice":10000,"id":"20","isDeleted":"","level":2,"list":null,"name":"西画雕塑","parentCode":"93","sort":13,"updateBy":"","updateTime":null,"version":0}]
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
         * enterId : 19
         * guaranteePrice : 10000
         * id : 3
         * isDeleted :
         * level : 2
         * list : null
         * name : 轿车
         * parentCode : 18
         * sort : 1
         * updateBy :
         * updateTime : null
         * version : 0
         */

        private String createBy;
        private Object createTime;
        private String enterId;
        private int guaranteePrice;
        private String id;
        private String isDeleted;
        private int level;
        private Object list;
        private String name;
        private String parentCode;
        private int sort;
        private String updateBy;
        private Object updateTime;
        private int version;

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

        public String getEnterId() {
            return enterId;
        }

        public void setEnterId(String enterId) {
            this.enterId = enterId;
        }

        public int getGuaranteePrice() {
            return guaranteePrice;
        }

        public void setGuaranteePrice(int guaranteePrice) {
            this.guaranteePrice = guaranteePrice;
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

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
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
