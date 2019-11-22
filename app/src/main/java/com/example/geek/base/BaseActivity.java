package com.example.geek.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
/*
  MVP
  V:处理视图    用户交互
  M: 数据操作  如：网络请求 数据库
  P:业务处理   连接 V层与M层
 */

public abstract class BaseActivity<V extends BaseView, P extends BasePeresenter> extends AppCompatActivity implements BaseView {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mPresenter =initPeresenter();
        if(mPresenter!=null){
          mPresenter.bind((V) this);
        }
          initView();
          initData();
          initListen();
    }

    protected abstract P initPeresenter();

    protected abstract int getLayoutId();

    protected void initView() {
    }

    ;

    protected void initData() {
    }

    ;

    protected void initListen() {
    }

    ;
}
