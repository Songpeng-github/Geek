package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:37
 */
public class CooperativeInstitutionsBean {

    /**
     * code : 1
     * data : [{"currentPage":1,"id":"16","isDeleted":"","logo":"http://file.quepai.cn//images/20191014/20191014090939230.png","name":"1","pageSize":10},{"currentPage":1,"id":"15","isDeleted":"","logo":"http://file.quepai.cn//images/20191014/20191014090932285.png","name":"阿里","pageSize":10}]
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
         * id : 16
         * isDeleted :
         * logo : http://file.quepai.cn//images/20191014/20191014090939230.png
         * name : 1
         * pageSize : 10
         */

        private int currentPage;
        private String id;
        private String isDeleted;
        private String logo;
        private String name;
        private int pageSize;

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

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }
}
