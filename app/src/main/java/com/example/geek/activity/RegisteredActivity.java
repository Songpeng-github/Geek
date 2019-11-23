package com.example.geek.activity;

import android.content.Intent;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.login.bean.RegisterBean;
import com.example.geek.login.peresenter.RegistredPeresener;
import com.example.geek.login.view.RegistredView;
import com.example.geek.utils.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:15:08
 *
 *              注册 界面
 */
public class RegisteredActivity extends BaseActivity<RegistredView, RegistredPeresener> implements RegistredView {

    @BindView(R.id.renext)
    ImageView renext;
   @BindView(R.id.check)
    CheckBox checkBox;




    @Override
    protected RegistredPeresener initPeresenter() {
        return new RegistredPeresener();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_registered;
    }

    @OnClick({R.id.renext,R.id.check})
    public  void  onClick(View view){
         switch (view.getId()){
             case R.id.renext:
                 if (checkBox.isChecked()==true) {
                     startActivity(new Intent(RegisteredActivity.this,SuccessActivity.class));
                 }else {
                     ToastUtil.showLong("您未同意注册协议");
                 }
                 break;


         }
    }

    @Override
    public void showRegister(RegisterBean registerBean) {

    }
}
