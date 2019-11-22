package com.example.geek.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.login.bean.ForgetBean;
import com.example.geek.login.bean.ForgetJson;
import com.example.geek.login.peresenter.ForgetPeresenter;
import com.example.geek.login.view.ForgetView;

import com.example.geek.utils.ToastUtil;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:9:24
 *
 *                   注册  忘记密码界面
 */
public class ForgetpasswordActivity extends BaseActivity<ForgetView, ForgetPeresenter> implements ForgetView {
    private static final String TAG = "ForgetpasswordActivity";
    @BindView(R.id.btn_next)
   ImageView btn_next;
   @BindView(R.id.phone)
    EditText phone;
   @BindView(R.id.yzm)
   EditText yzm;
   @BindView(R.id.forget)
    Button forget;
    private ForgetBean forgetBean1;

    @Override
    protected ForgetPeresenter initPeresenter() {
        return new ForgetPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget;
    }



     //跳转重新设置密码界面
    @OnClick({R.id.btn_next,R.id.phone,R.id.yzm,R.id.forget})
    public  void  onClick(View view){
      switch (view.getId()){
          case R.id.phone:
              break;
          case R.id.yzm:
              break;
          case R.id.forget:
              Gson gson = new Gson();
              String s = gson.toJson(new ForgetJson(yzm.getText().toString()));
              ToastUtil.showLong(s);
              mPresenter.getForgetModel(s);
              break;
          case R.id.btn_next:
              if(forgetBean1.getMsg().equals("success")){
                  startActivity(new Intent(ForgetpasswordActivity.this,ResetPasswordActivity.class));
              }else {
                  ToastUtil.showLong("验证码错误");
              }
              break;
      }
    }
    @Override
    public void showForget(ForgetBean forgetBean) {
        Log.d(TAG, "showForget: "+forgetBean.toString());
        forgetBean1 = new ForgetBean();
    }
    }
