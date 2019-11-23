package com.example.geek.login.model;

import com.example.geek.base.BaseModel;
import com.example.geek.login.bean.CheckBean;
import com.example.geek.login.bean.ForgetBean;
import com.example.geek.network.ApiService;
import com.example.geek.network.BaseObserver;
import com.example.geek.network.HttpUtils;
import com.example.geek.network.ResultCallBack;
import com.example.geek.network.RxUtils;
import com.example.geek.utils.Logger;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * name:&{宋佳羿}
 * date:2019/11/23
 * Time:11:46
 */


public class CheckModel extends BaseModel {

    private static final String TAG = "CheckModel";

    public void check(String json, final ResultCallBack callBack) {

        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.sBaseUrl, ApiService.class);
        RequestBody body = RequestBody.create(MediaType.parse("Content-Type:application/json"), json);

        Observable<CheckBean> forget = apiserver.getCheck(body);
        forget.compose(RxUtils.<CheckBean>rxObserableSchedulerHelper())//切换线程

                .subscribe(new BaseObserver<CheckBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(CheckBean bean) {
                        Logger.logD(TAG,"===========CheckBean==============="+bean.toString());
                        callBack.onSuccess(bean);
                    }
                });

    }


}
