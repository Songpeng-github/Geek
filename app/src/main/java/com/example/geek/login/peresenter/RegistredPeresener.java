package com.example.geek.login.peresenter;

import android.text.TextUtils;

import com.example.geek.base.BasePeresenter;
import com.example.geek.login.bean.RegisterBean;
import com.example.geek.login.model.RegistredModel;
import com.example.geek.login.view.RegistredView;
import com.example.geek.network.ResultCallBack;
import com.example.geek.utils.ToastUtil;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:15:14
 */
public class RegistredPeresener extends BasePeresenter<RegistredView> implements ResultCallBack {


    private RegistredModel registredModel;

    public  void  Registre(String name, String pass, String password,String qy, String json){
        if(TextUtils.isEmpty(name)||TextUtils.isEmpty(pass)||TextUtils.isEmpty(password)||TextUtils.isEmpty(qy)){
            ToastUtil.showLong("请填入详细信息");
            if(pass.equals("")!=password.equals("")){
                ToastUtil.showLong("输入的密码不一致");
            }
        }else {
            registredModel.Registred(json,this);
        }
      }

      public  void  Registre2(String name,String pass,String password,String json){
        if(TextUtils.isEmpty(name)||TextUtils.isEmpty(pass)||TextUtils.isEmpty(password)){
            ToastUtil.showLong("请填入详细信息");
            if(pass.equals("")!=password.equals("")){
                ToastUtil.showLong("输入的密码不一致");
            }

        }else {
            registredModel.Registred(json,this);
        }
      }

    @Override
    protected void initModel() {
        registredModel = new RegistredModel();
        models.add(registredModel);
    }

    @Override
    public void onSuccess(Object bean) {
        view.showRegister((RegisterBean) bean);
    }

    @Override
    public void onFail(String msg) {

    }
}
