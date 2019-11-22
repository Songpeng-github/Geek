package com.example.geek.activity;


import android.content.Intent;

import android.widget.EditText;
import android.widget.ImageView;
import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.login.bean.RegisterBean;
import com.example.geek.login.bean.RegisterJson;
import com.example.geek.login.peresenter.RegistredPeresener;
import com.example.geek.login.view.RegistredView;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:14:56
 *
 *              注册 企业界面
 */

public class EnterpriseActivity extends BaseActivity<RegistredView, RegistredPeresener> implements RegistredView {

  @BindView(R.id.btn_next)
    ImageView btn_next;
  @BindView(R.id.name)
  EditText name;
  @BindView(R.id.enterprise)
  EditText enterprise;
  @BindView(R.id.password)
  EditText password;
  @BindView(R.id.confirmpassword)
  EditText confirmpassword;



    @Override
    protected RegistredPeresener initPeresenter() {
        return new RegistredPeresener();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_enterprise;
    }

    @OnClick(R.id.btn_next)
    public  void  onClick(){
      // mPresenter.Registre(name.getText().toString(),enterprise.getText().toString(),password.getText().toString(),confirmpassword.getText().toString(),new Gson().toJson(new RegisterJson(name.getText().toString(),enterprise.getText().toString(),password.getText().toString(),confirmpassword.getText())));
        startActivity(new Intent(EnterpriseActivity.this,RegisteredActivity.class));
    }

    @Override
    public void showRegister(RegisterBean registerBean) {
      if(registerBean.getCode().equals("1")){
            startActivity(new Intent(this,RegisteredActivity.class));
      }
    }
}
