package com.example.geek.login.peresenter;

import com.example.geek.base.BasePeresenter;
import com.example.geek.login.bean.CheckBean;
import com.example.geek.login.model.CheckModel;
import com.example.geek.login.view.CheckView;
import com.example.geek.network.ResultCallBack;

/**
 * name:宋佳羿
 * date:2019/11/23
 * Time:11:45
 */
public class CheckPeresenter extends BasePeresenter<CheckView> implements ResultCallBack {


    private CheckModel checkModel;


    public  void  check(String json){
        checkModel.check(json,this);
    }
    @Override
    protected void initModel() {
        checkModel = new CheckModel();
        models.add(checkModel);
    }

    @Override
    public void onSuccess(Object bean) {
        view.showCheck((CheckBean) bean);
    }

    @Override
    public void onFail(String msg) {

    }
}
