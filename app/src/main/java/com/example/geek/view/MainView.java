package com.example.geek.view;

import com.example.geek.base.BaseView;
import com.example.geek.bean.BannerBean;
import com.example.geek.bean.FirstBean;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:23
 */
public interface MainView extends BaseView {
    void showBanner(BannerBean bannerBean);

    void  showFirst(FirstBean bean);
}
