package com.example.geek.login.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:13
 */
public class LoginBean {

private  int  code;
private  String  data;
private  String  msg;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LoginBean() {
        super();
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "code=" + code +
                ", data='" + data + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
