package com.example.geek.peresenter;

import android.util.Log;

import com.example.geek.base.BasePeresenter;
import com.example.geek.bean.BannerBean;
import com.example.geek.model.MianModel;
import com.example.geek.network.ResultCallBack;
import com.example.geek.view.MainView;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:24
 */
public class MainPeresenter extends BasePeresenter<MainView> implements ResultCallBack {



    private static final String TAG = "MainPeresenter";
    private MianModel mianModel;


    public void  Banner(String json){
        mianModel.banner(json,this);
    }

    @Override
    protected void initModel() {
        mianModel = new MianModel();
        models.add(mianModel);
    }

    @Override
    public void onSuccess(Object bean) {
        view.showBanner((BannerBean) bean);
    }

    @Override
    public void onFail(String msg) {
        Log.d(TAG, "onFail: "+msg);
    }
}
