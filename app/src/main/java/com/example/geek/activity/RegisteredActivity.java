package com.example.geek.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.RegistredPeresener;
import com.example.geek.login.view.RegistredView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:15:08
 *
 *              注册 界面
 */
public class RegisteredActivity extends BaseActivity<RegistredView, RegistredPeresener> implements BaseView {

@BindView(R.id.btn_next)
    ImageView btn_next;

    @Override
    protected RegistredPeresener initPeresenter() {
        return new RegistredPeresener();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_registered;
    }

    @OnClick({R.id.btn_next})
    public  void  onClick(View view){
         switch (view.getId()){
             case R.id.btn_next:
                 startActivity(new Intent(RegisteredActivity.this,SuccessActivity.class));
                 break;

         }
    }
}
