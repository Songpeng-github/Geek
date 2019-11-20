package com.example.geek.activity;


import android.content.Intent;

import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.EnterprosePeresenter;
import com.example.geek.login.view.EnterproseView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:14:56
 *
 *              注册 企业界面
 */

public class EnterpriseActivity extends BaseActivity<EnterproseView, EnterprosePeresenter> implements BaseView {

  @BindView(R.id.btn_next)
    ImageView btn_next;

    @Override
    protected EnterprosePeresenter initPeresenter() {
        return new EnterprosePeresenter();
    }



    @Override
    protected int getLayoutId() {
        return R.layout.activity_enterprise;
    }

    @OnClick(R.id.btn_next)
    public  void  onClick(){
        startActivity(new Intent(EnterpriseActivity.this,RegisteredActivity.class));
    }
}
