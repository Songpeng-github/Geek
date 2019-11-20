package com.example.geek.utils;

import android.util.Log;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:36
 */
public class Logger {
    public static void logD(String tag,String msg){
        if (Constants.isDebug){
            Log.d(tag, "logD: "+msg);
        }
    }
}
