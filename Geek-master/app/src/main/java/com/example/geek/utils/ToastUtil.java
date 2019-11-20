package com.example.geek.utils;

import android.widget.Toast;

import com.example.geek.base.BaseApp;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:30
 */
public class ToastUtil {
    public static void showShort(String msg){
        //避免内存泄漏的一个方法,用到上下文的地方,能用application的就application
        Toast.makeText(BaseApp.getInstance(),msg,Toast.LENGTH_SHORT).show();
    }
    public static void showLong(String msg){
        //避免内存泄漏的一个方法,用到上下文的地方,能用application的就application
        Toast.makeText(BaseApp.getInstance(),msg,Toast.LENGTH_LONG).show();
    }
}
