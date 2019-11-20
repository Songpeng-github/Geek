package com.example.geek.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.SuccessPeresenter;
import com.example.geek.login.view.SuccssView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:13:44
 *
 *              注册成功界面
 */
public class SuccessActivity extends BaseActivity<SuccssView, SuccessPeresenter> implements BaseView {

  @BindView(R.id.btn_next)
    ImageView  btn_next;

    @Override
    protected SuccessPeresenter initPeresenter() {
        return new SuccessPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_success;
    }

    @OnClick(R.id.btn_next)
    public  void  Click(){
        startActivity(new Intent(SuccessActivity.this,LoginActivity.class));
    }

}
