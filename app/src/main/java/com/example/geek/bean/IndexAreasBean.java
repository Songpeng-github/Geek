package com.example.geek.bean;

import java.util.List;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:9:25
 */
public class IndexAreasBean {

    /**
     * code : 1
     * data : [{"areaId":"1","areaName":"北京","id":"81","isDeleted":"","list":null,"sort":1},{"areaId":"19","areaName":"天津","id":"82","isDeleted":"","list":null,"sort":2},{"areaId":"37","areaName":"河北","id":"83","isDeleted":"","list":null,"sort":3},{"areaId":"217","areaName":"山西","id":"84","isDeleted":"","list":null,"sort":4},{"areaId":"348","areaName":"内蒙","id":"85","isDeleted":"","list":null,"sort":5},{"areaId":"792","areaName":"上海","id":"86","isDeleted":"","list":null,"sort":6},{"areaId":"810","areaName":"江苏","id":"87","isDeleted":"","list":null,"sort":7},{"areaId":"920","areaName":"浙江","id":"88","isDeleted":"","list":null,"sort":8},{"areaId":"1021","areaName":"安徽","id":"89","isDeleted":"","list":null,"sort":9},{"areaId":"1143","areaName":"福建","id":"90","isDeleted":"","list":null,"sort":10},{"areaId":"1238","areaName":"江西","id":"91","isDeleted":"","list":null,"sort":11},{"areaId":"1350","areaName":"山东","id":"92","isDeleted":"","list":null,"sort":12},{"areaId":"1505","areaName":"河南","id":"93","isDeleted":"","list":null,"sort":13},{"areaId":"1681","areaName":"湖北","id":"94","isDeleted":"","list":null,"sort":14},{"areaId":"1798","areaName":"湖南","id":"95","isDeleted":"","list":null,"sort":15},{"areaId":"1935","areaName":"广东","id":"96","isDeleted":"","list":null,"sort":16},{"areaId":"2079","areaName":"广西","id":"97","isDeleted":"","list":null,"sort":17},{"areaId":"2277","areaName":"四川","id":"98","isDeleted":"","list":null,"sort":18},{"areaId":"2236","areaName":"重庆","id":"99","isDeleted":"","list":null,"sort":19}]
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
         * areaId : 1
         * areaName : 北京
         * id : 81
         * isDeleted :
         * list : null
         * sort : 1
         */

        private String areaId;
        private String areaName;
        private String id;
        private String isDeleted;
        private Object list;
        private int sort;

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
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
    }
}
