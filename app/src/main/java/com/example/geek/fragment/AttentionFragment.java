package com.example.geek.fragment;

import androidx.fragment.app.Fragment;

import com.example.geek.base.BaseFragment;
import com.example.geek.peresenter.AttentionPeresenter;
import com.example.geek.view.AttentionView;

/**
 * name:&{宋佳羿}
 * date:2019/11/21
 * Time:15:17
 */
public class AttentionFragment extends BaseFragment<AttentionView, AttentionPeresenter>  implements AttentionView{
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected AttentionPeresenter initPeresenter() {
        return new AttentionPeresenter();
    }
}
