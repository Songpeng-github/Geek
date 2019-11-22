package com.example.geek.login.peresenter;

import android.text.TextUtils;
import android.util.Log;

import com.example.geek.base.BasePeresenter;
import com.example.geek.login.bean.ResetBean;
import com.example.geek.login.model.ForgetModel;
import com.example.geek.login.model.ResetModel;
import com.example.geek.login.view.ResetView;
import com.example.geek.network.ResultCallBack;
import com.example.geek.utils.ToastUtil;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:15:20
 */
public class ResetPeresenter extends BasePeresenter<ResetView> implements ResultCallBack {
    private static final String TAG = "ResetPeresenter";

        ResetModel resetModel= new ResetModel();
        public  void  Reset(String pass,String confirm,String json){

            if(TextUtils.isEmpty(pass)||TextUtils.isEmpty(confirm)||pass.equals("")!=confirm.equals("")){
                ToastUtil.showLong("手机号和密码不能为空");
                return;
            }else {
                resetModel.Reset(json,this);
            }
        }

    @Override
    protected void initModel() {
        resetModel = new ResetModel();
        models.add(resetModel);
    }

    @Override
    public void onSuccess(Object bean) {
        Log.d(TAG, "onSuccess: "+bean);
          view.showResetBean((ResetBean) bean);
    }

    @Override
    public void onFail(String msg) {


    }
}
