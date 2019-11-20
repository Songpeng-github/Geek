package com.example.geek.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.StatusPeresenter;
import com.example.geek.login.view.StatusView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:14:19
 *
 *           注册  选择身份界面
 */



public class StatusActivity extends BaseActivity<StatusView, StatusPeresenter> implements BaseView {
@BindView(R.id.city)
    ImageView city;
@BindView(R.id.people)
    ImageView people;


    @Override
    protected StatusPeresenter initPeresenter() {
        return new StatusPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_status;
    }

    @OnClick({R.id.city,R.id.people})
    public  void  onClick(View view){
          switch (view.getId()){
              case R.id.city:
                   startActivity(new Intent(StatusActivity.this,EnterpriseActivity.class));
                  break;
              case  R.id.people:
                  startActivity(new Intent(StatusActivity.this,PersonalActivity.class));
                  break;
          }
    }
}
