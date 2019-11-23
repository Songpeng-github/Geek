package com.example.geek.peresenter;

import android.util.Log;

import com.example.geek.base.BasePeresenter;
import com.example.geek.bean.FirstBean;
import com.example.geek.model.FirseModel;
import com.example.geek.network.ResultCallBack;
import com.example.geek.view.FirstView;

/**
 * name:宋佳羿
 * date:2019/11/23
 * Time:14:08
 */

public class FirstPeresenter extends BasePeresenter<FirstView> {
    private static final String TAG = "FirstPeresenter";

    private FirseModel firseModel;

    public void First(String json){
          firseModel.first(json, new ResultCallBack() {
              @Override
              public void onSuccess(Object bean) {
                  Log.d(TAG, "onSuccess: "+bean.toString());
                   view.showFirst((FirstBean) bean);
              }

              @Override
              public void onFail(String msg) {

              }
          });
      }

    @Override
    protected void initModel() {
        firseModel = new FirseModel();
        models.add(firseModel);
    }
}
