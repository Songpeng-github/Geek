package com.example.geek.login.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/21
 * Time:13:40
 */
public class ResetBean {

    /**
     * code : 1
     * msg : success
     * data : null
     */

    private String code;
    private String msg;
    private Object data;

    public ResetBean(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResetJson{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
