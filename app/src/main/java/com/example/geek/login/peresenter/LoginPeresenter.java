package com.example.geek.login.peresenter;
import android.text.TextUtils;
import com.example.geek.base.BasePeresenter;
import com.example.geek.login.bean.LoginBean;
import com.example.geek.login.model.LoginModel;
import com.example.geek.login.view.LoginView;
import com.example.geek.network.ResultCallBack;
import com.example.geek.utils.ToastUtil;




/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:18:14
 */


public class LoginPeresenter extends BasePeresenter<LoginView> implements ResultCallBack {

    private static final String TAG = "LoginPeresenter";
    public LoginModel loginModel = new LoginModel();

    public void login(String name, String password,String json) {
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password)) {
            ToastUtil.showLong("账号或者密码不能为空");
            return;
        } else {
            loginModel.login(json,this);

        }
    }


    @Override
    protected void initModel() {
        loginModel = new LoginModel();
        models.add(loginModel);
    }


    @Override
    public void onSuccess(Object bean) {
        view.showLoginbean((LoginBean) bean);
    }

    @Override
    public void onFail(String msg) {

    }


}
