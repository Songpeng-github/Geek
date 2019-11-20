package com.example.geek.network;

import android.util.Log;
import com.example.geek.utils.ToastUtil;
import io.reactivex.Observer;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:43
 */
public abstract class BaseObserver<T> implements Observer<T> {

    private final String TAG = getClass().getName();

    @Override
    public void onError(Throwable e) {
        Log.d(TAG, "onError: "+e.toString());
        ToastUtil.showShort("数据加载失败");
    }
    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete: ");
    }
}
