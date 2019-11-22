package com.example.geek.activity;


import android.content.Intent;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.login.bean.ResetBean;
import com.example.geek.login.bean.ResetJson;
import com.example.geek.login.peresenter.ResetPeresenter;
import com.example.geek.login.view.ResetView;
import com.example.geek.utils.ToastUtil;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:10:12
 *
 *                重置密码界面
 */

public class ResetPasswordActivity extends BaseActivity<ResetView, ResetPeresenter> implements ResetView {
    @BindView(R.id.btn_next)
    ImageView btn_next;
    @BindView(R.id.password)
     EditText password;
    @BindView(R.id.confirmpassword)
     EditText confirm;


    @Override
    protected ResetPeresenter initPeresenter() {
        return new ResetPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_resetpassword;
    }

    @OnClick({R.id.btn_next,R.id.password,R.id.confirmpassword})
    public  void  onClick(View view){
        switch (view.getId()){
            case R.id.btn_next:
                mPresenter.Reset(password.getText().toString().trim(),confirm.getText().toString().trim(),new Gson().toJson(new ResetJson(password.getText().toString(),confirm.getText().toString())));
                break;
            case R.id.password:

                break;
            case R.id.confirmpassword:

                break;
        }

    }

    @Override
    public void showResetBean(ResetBean resetBean) {
        ToastUtil.showLong("-------------ResetBean-------------------"+resetBean);
        startActivity(new Intent(ResetPasswordActivity.this,ResetOKActivity.class));
    }
}
