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
     * data : [{"code":"经营范围CODE","guaranteeprice":"保证金","level":"经营范围层级","name":"经营范围名称","parentcode":"上级分类CODE","soft":"排序"}]
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
         * code : 经营范围CODE
         * guaranteeprice : 保证金
         * level : 经营范围层级
         * name : 经营范围名称
         * parentcode : 上级分类CODE
         * soft : 排序
         */

        private String code;
        private String guaranteeprice;
        private String level;
        private String name;
        private String parentcode;
        private String soft;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getGuaranteeprice() {
            return guaranteeprice;
        }

        public void setGuaranteeprice(String guaranteeprice) {
            this.guaranteeprice = guaranteeprice;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParentcode() {
            return parentcode;
        }

        public void setParentcode(String parentcode) {
            this.parentcode = parentcode;
        }

        public String getSoft() {
            return soft;
        }

        public void setSoft(String soft) {
            this.soft = soft;
        }
    }
}
