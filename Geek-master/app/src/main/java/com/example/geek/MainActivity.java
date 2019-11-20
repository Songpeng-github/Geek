package com.example.geek;



import com.example.geek.base.BaseActivity;
import com.example.geek.base.BaseView;
import com.example.geek.peresenter.MainPeresenter;
import com.example.geek.view.MainView;

public class MainActivity extends BaseActivity<MainView, MainPeresenter>  implements  BaseView{


    @Override
    protected MainPeresenter initPeresenter() {
        return new MainPeresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
