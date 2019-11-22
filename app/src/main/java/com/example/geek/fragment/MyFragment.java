package com.example.geek.fragment;

import androidx.fragment.app.Fragment;

import com.example.geek.R;
import com.example.geek.base.BaseFragment;
import com.example.geek.peresenter.HomePeresenter;
import com.example.geek.view.HomeView;

/**
 * name:&{宋佳羿}
 * date:2019/11/21
 * Time:15:18
 */
public class MyFragment extends BaseFragment<HomeView, HomePeresenter> implements  HomeView {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected HomePeresenter initPeresenter() {
        return new HomePeresenter();
    }
}
