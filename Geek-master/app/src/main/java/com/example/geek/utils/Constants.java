package com.example.geek.utils;

import android.os.Environment;

import com.example.geek.base.BaseApp;

import java.io.File;
/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:34
 */
public interface Constants {
    boolean isDebug = true;
    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "codeest" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY="com.baidu.geek.fileprovider";


    //网络缓存的地址
    String PATH_DATA = BaseApp.getInstance().getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";
    String DATA = "data";
    //夜间模式
    String MODE = "mode";
    String NIGHT_CURRENT_FRAG_POS = "fragment_pos";
}
