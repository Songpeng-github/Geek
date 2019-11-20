package com.example.geek.login.model;


import android.util.Log;

import com.example.geek.base.BaseModel;

import com.example.geek.login.bean.LoginBean;
import com.example.geek.network.ApiService;
import com.example.geek.network.BaseObserver;
import com.example.geek.network.HttpUtils;
import com.example.geek.network.ResultCallBack;
import com.example.geek.network.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import okhttp3.MediaType;
import okhttp3.RequestBody;


/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:18:14
 */
public class LoginModel  extends BaseModel {
    private static final String TAG = "LoginModel";

    public void login(String json, final ResultCallBack callBack) {

        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.sBaseUrl, ApiService.class);

        RequestBody body = RequestBody.create(MediaType.parse("Content-Type:application/json"), json);
        Observable<LoginBean> login1 = apiserver.getlogin(body);


        login1.compose(RxUtils.<LoginBean>rxObserableSchedulerHelper())//切换线程

                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(LoginBean bean) {

                        callBack.onSuccess(bean);
                    }
                });
    }


}
