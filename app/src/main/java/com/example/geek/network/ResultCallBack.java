package com.example.geek.network;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:46
 */
public interface ResultCallBack<T> {

    void onSuccess(T bean);
    void onFail(String msg);
}
