package com.example.geek.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.ResetPeresenter;
import com.example.geek.login.view.ResetView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:10:12
 *
 *                重置密码界面
 */


public class ResetPasswordActivity extends BaseActivity<ResetView, ResetPeresenter> implements BaseView {
    @BindView(R.id.btn_next)
    ImageView btn_next;



    @Override
    protected ResetPeresenter initPeresenter() {
        return new ResetPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_resetpassword;
    }

    @OnClick({R.id.btn_next})
    public  void  onClick(){
        startActivity(new Intent(this, ResetOKActivity.class));
    }
}
