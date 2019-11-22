package com.example.geek;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.geek.adapter.BannerReadapter;
import com.example.geek.base.BaseActivity;

import com.example.geek.bean.BannerBean;
import com.example.geek.peresenter.MainPeresenter;
import com.example.geek.view.MainView;

import com.google.gson.Gson;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseActivity<MainView, MainPeresenter>  implements  MainView{

   @BindView(R.id.banner)
    Banner   banner;
   @BindView(R.id.serachview)
    SearchView searchView;
   @BindView(R.id.re)
   RecyclerView recyclerView;
   @BindView(R.id.fenxiang)
    ImageView fx;
    private boolean mIsShowing = false;
    private PopupWindow popupWindow;
    private WindowManager.LayoutParams params;

    @Override
    protected MainPeresenter initPeresenter() {
        return new MainPeresenter();

    }

     @Override
     protected void initData() {
       mPresenter.Banner(new Gson().toJson(new BannerBean()));

     }

    @Override
    protected void initView() {

        params = getWindow().getAttributes();


     LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
     recyclerView.setLayoutManager(linearLayoutManager);
     ArrayList<BannerBean> bannerBeans = new ArrayList<>();
     BannerReadapter bannerReadapter = new BannerReadapter(bannerBeans,this);
     recyclerView.setAdapter(bannerReadapter);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showBanner(BannerBean bannerBean) {
     List<BannerBean.DataBean> data = bannerBean.getData();

    }

    public void popup(View view){
        if(popupWindow == null){
            initPopup();
        }
        if(!mIsShowing){
            params.alpha= 0.3f;
            getWindow().setAttributes(params);
            popupWindow.showAtLocation(findViewById(R.id.fenxiang), Gravity.BOTTOM,0,0);
            mIsShowing = true;
        }
    }



    private void initPopup() {
        View pop = View.inflate(this, R.layout.popupwindow, null);
        popupWindow = new PopupWindow(pop, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        popupWindow.setAnimationStyle(R.style.anim_menu_bottombar);
        mIsShowing = false;
    }


    public void dismiss(View view){
        if(popupWindow != null &&mIsShowing){
            popupWindow.dismiss();
            mIsShowing = false;
            params.alpha= 1f;
            getWindow().setAttributes(params);
        }
    }







}
