package com.example.geek.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.PersonalPeresenter;
import com.example.geek.login.view.PersonalView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:14:00
 *
 *              注册  个人用户界面
 */

public class PersonalActivity extends BaseActivity<PersonalView, PersonalPeresenter> implements BaseView {

@BindView(R.id.btn_next)
    ImageView btn_text;



    @Override
    protected PersonalPeresenter initPeresenter() {
        return new PersonalPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_personal;
    }
    @OnClick(R.id.btn_next)
    public  void  Click(){
    startActivity(new Intent(PersonalActivity.this,RegisteredActivity.class));
    }
}
