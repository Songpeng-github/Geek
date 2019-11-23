package com.example.geek.activity;


import android.content.Intent;
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

@BindView(R.id.pnext)
    ImageView next;



    @Override
    protected PersonalPeresenter initPeresenter() {
        return new PersonalPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_personal;
    }
    @OnClick(R.id.pnext)
    public  void  Click(){
    startActivity(new Intent(PersonalActivity.this,RegisteredActivity.class));
    }
}
