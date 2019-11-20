package com.example.geek.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public  abstract class BaseFragment<V extends  BaseView,P extends  BasePeresenter> extends Fragment implements  BaseView {


    private Unbinder bind;
    public  P  mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(getLayoutId(), null);
        bind = ButterKnife.bind(this, inflate);
        mPresenter= initPeresenter();
        if(mPresenter!=null){
         mPresenter.bind((V)this);
}

          initView();
          initData();
          initListen();
        return  inflate;
    }

    protected abstract int getLayoutId();
    protected  abstract  P initPeresenter();
    protected  void  initView(){};
    protected  void  initData(){};
    protected  void   initListen(){};
}
