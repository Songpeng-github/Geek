package com.example.geek.activity;

import android.content.Intent;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.login.peresenter.LoginPeresenter;
import com.example.geek.login.view.LoginView;

import butterknife.BindView;

import butterknife.OnClick;
/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:8:56
 *
 *                登录界面
 */
public class LoginActivity extends BaseActivity<LoginView, LoginPeresenter> implements  LoginView{
    @BindView(R.id.btn_next)
    ImageView next;
    @BindView(R.id.weibo)
    ImageView weibo;
    @BindView(R.id.qq)
    ImageView qq;
    @BindView(R.id.registered)
    TextView registered;
    @BindView(R.id.number)
    EditText number;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.forget)
    TextView  forget;
    @BindView(R.id.path)
    ImageView path;





    @Override
    protected LoginPeresenter initPeresenter() {
        return new LoginPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    //点击事件
    @OnClick({R.id.btn_next,R.id.registered,R.id.weibo,R.id.qq,R.id.forget,R.id.path})
    public void  onClick(View view){
         switch (view.getId()){
             case R.id.btn_next:

                 break;
                 //跳转注册界面
             case R.id.registered:
                 startActivity(new Intent(LoginActivity.this, StatusActivity.class));
                 break;
             case R.id.weibo:


                 break;
             case  R.id.qq:

                 break;
                 //   跳转 忘记密码界面
             case R.id.forget:
                 startActivity(new Intent(LoginActivity.this, ForgetpasswordActivity.class));
                 break;
         }
    }

    @Override
    public String name() {
    return number.getText().toString().trim();

    }

    @Override
    public String password() {
     return  password.getText().toString().trim();
    }
}
