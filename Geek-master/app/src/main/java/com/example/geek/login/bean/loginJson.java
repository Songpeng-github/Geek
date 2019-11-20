package com.example.geek.login.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/20
 * Time:&{TIME}
 */
public class loginJson {

    public loginJson(String loginname, String password) {
        this.loginname = loginname;
        this.password = password;
    }

    /**
     * loginname : 17621377231
     * password : 111111
     */

    private String loginname;
    private String password;

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
