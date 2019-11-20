package com.example.geek.activity;

import android.content.Intent;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.ForgetPeresenter;
import com.example.geek.login.view.ForgetView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:9:24
 *
 *                   注册  忘记密码界面
 */
public class ForgetpasswordActivity extends BaseActivity<ForgetView, ForgetPeresenter> implements BaseView {
   @BindView(R.id.btn_next)
   ImageView btn_next;


    @Override
    protected ForgetPeresenter initPeresenter() {
        return new ForgetPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget;
    }

     //跳转重新设置密码界面
    @OnClick({R.id.btn_next})
    public  void  onClick(){
        startActivity(new Intent(this,ResetPasswordActivity.class));
    }
}
