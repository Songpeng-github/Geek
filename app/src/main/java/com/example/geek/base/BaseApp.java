package com.example.geek.base;

import android.app.Application;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:24
 */
public class BaseApp extends Application {

     private  static  BaseApp baseApp;
    @Override
    public void onCreate() {
        super.onCreate();
        baseApp = this;
    }

    public  static  BaseApp getInstance(){
        return    baseApp;
    }
}
