package com.example.geek.login.model;


import com.example.geek.base.BaseModel;
import com.example.geek.login.bean.LoginBean;
import com.example.geek.network.ApiService;
import com.example.geek.network.BaseObserver;
import com.example.geek.network.HttpUtils;
import com.example.geek.network.ResultCallBack;
import com.example.geek.network.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import okhttp3.RequestBody;

/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:18:14
 */
public class LoginModel  extends BaseModel {
    private static final String TAG = "LoginModel";

    public void login(String name, String psd, final ResultCallBack callBack) {

        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.sBaseUrl, ApiService.class);

        Observable<RequestBody> login1 = apiserver.login(name, psd);


        login1.compose(RxUtils.<RequestBody>rxObserableSchedulerHelper())//切换线程

                .subscribe(new BaseObserver<RequestBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(RequestBody bean) {
                        callBack.onSuccess(bean);
                    }
                });
    }


}
