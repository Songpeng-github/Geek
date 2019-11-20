package com.example.geek.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:17:09
 *
 *
 *   切断页面联系
 *
 */
public class BaseModel {

    protected CompositeDisposable compositeDisposable=new CompositeDisposable();
    public  void  onDestory(){
        compositeDisposable.clear();
    }
}
