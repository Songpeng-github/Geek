package com.example.geek.login.peresenter;
import android.text.TextUtils;
import com.example.geek.base.BasePeresenter;
import com.example.geek.login.model.LoginModel;
import com.example.geek.login.view.LoginView;
import com.example.geek.utils.ToastUtil;




/**
 * name:&{宋佳羿}
 * date:2019/11/18
 * Time:18:14
 */


public class LoginPeresenter extends BasePeresenter<LoginView> {


    private static final String TAG = "LoginPeresenter";
    private LoginModel loginModel;



    public void login() {
        String name = view.name();
        String password = view.password();
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password)) {
            ToastUtil.showLong("用户名或者密码不能为空");
            return;
        }
    }





    @Override
    protected void initModel() {
        loginModel = new LoginModel();
        models.add(loginModel);
    }

}
