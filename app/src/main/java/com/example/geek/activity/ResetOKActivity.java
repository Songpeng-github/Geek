package com.example.geek.activity;



import android.content.Intent;


import com.example.geek.R;
import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.login.peresenter.ResetOKPeresenter;

import com.example.geek.login.view.ResetOKView;

import butterknife.OnClick;


/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:11:21
 *
 *           重新设置密码成功界面
 */

public class ResetOKActivity extends BaseActivity<ResetOKView, ResetOKPeresenter> implements BaseView {


    @Override
    protected ResetOKPeresenter initPeresenter() {
        return new ResetOKPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reset;
    }

     @OnClick(R.id.btn)
    public  void  Click(){
        startActivity(new Intent(ResetOKActivity.this,LoginActivity.class));
     }

}
