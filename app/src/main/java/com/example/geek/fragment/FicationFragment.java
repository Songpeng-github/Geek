package com.example.geek.fragment;

import androidx.fragment.app.Fragment;

import com.example.geek.R;
import com.example.geek.base.BaseFragment;
import com.example.geek.peresenter.FicationPeresenter;
import com.example.geek.view.FicationView;

/**
 * name:&{宋佳羿}
 * date:2019/11/21
 * Time:15:16
 */
public class FicationFragment extends BaseFragment<FicationView, FicationPeresenter> implements  FicationView {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fication;
    }

    @Override
    protected FicationPeresenter initPeresenter() {
        return new FicationPeresenter();
    }
}
