package com.example.geek.login.bean;

/**
 * name:&{宋佳羿}
 * date:2019/11/21
 * Time:16:20
 */
public class RegisterJson {


    public RegisterJson(String loginname, String password, String regiontype, String nickname, String licensecreditno, String shopname, String address, String industry, String licensepic) {
        this.loginname = loginname;
        this.password = password;
        this.regiontype = regiontype;
        this.nickname = nickname;
        this.licensecreditno = licensecreditno;
        this.shopname = shopname;
        this.address = address;
        this.industry = industry;
        this.licensepic = licensepic;
    }

    /**
     * loginname :
     * password :
     * regiontype :
     * nickname :
     * licensecreditno :
     * shopname :
     * address :
     * industry :
     * licensepic :
     */

    private String loginname;
    private String password;
    private String regiontype;
    private String nickname;
    private String licensecreditno;
    private String shopname;
    private String address;
    private String industry;
    private String licensepic;

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

    public String getRegiontype() {
        return regiontype;
    }

    public void setRegiontype(String regiontype) {
        this.regiontype = regiontype;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLicensecreditno() {
        return licensecreditno;
    }

    public void setLicensecreditno(String licensecreditno) {
        this.licensecreditno = licensecreditno;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLicensepic() {
        return licensepic;
    }

    public void setLicensepic(String licensepic) {
        this.licensepic = licensepic;
    }

    @Override
    public String toString() {
        return "RegisterJson{" +
                "loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", regiontype='" + regiontype + '\'' +
                ", nickname='" + nickname + '\'' +
                ", licensecreditno='" + licensecreditno + '\'' +
                ", shopname='" + shopname + '\'' +
                ", address='" + address + '\'' +
                ", industry='" + industry + '\'' +
                ", licensepic='" + licensepic + '\'' +
                '}';
    }
}
