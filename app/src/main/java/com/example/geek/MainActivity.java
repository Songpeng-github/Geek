package com.example.geek;



import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.geek.adapter.BannerReadapter;
import com.example.geek.adapter.MainAdapter;
import com.example.geek.base.BaseActivity;

import com.example.geek.bean.BannerBean;
import com.example.geek.bean.FirstBean;
import com.example.geek.fragment.AttentionFragment;
import com.example.geek.fragment.FicationFragment;
import com.example.geek.fragment.HomeFragment;
import com.example.geek.fragment.MyFragment;
import com.example.geek.peresenter.MainPeresenter;
import com.example.geek.view.MainView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseActivity<MainView, MainPeresenter>  implements  MainView{

    private static final String TAG = "MainActivity";

    @BindView(R.id.serachview)
    SearchView searchView;
    @BindView(R.id.re)
    RecyclerView recyclerView;
    @BindView(R.id.fenxiang)
    ImageView fx;
    @BindView(R.id.rlv)
    RecyclerView rlv;
    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.shouye)
    RadioButton shouye;
    @BindView(R.id.fenlei)
    RadioButton fenlei;
    @BindView(R.id.guanzhu)
    RadioButton guanzhu;
    @BindView(R.id.wode)
    RadioButton wode;
    private boolean mIsShowing = false;
    private PopupWindow popupWindow;
    private WindowManager.LayoutParams params;
    private ArrayList<BannerBean.DataBean> bannerBeans;
    private BannerReadapter bannerReadapter;
    private ArrayList<String> strings;
    private ArrayList<Fragment> fragments;

    @Override
    protected MainPeresenter initPeresenter() {
        return new MainPeresenter();

    }

     @Override
     protected void initData() {
         BannerBean bannerBean = new BannerBean();
         List<BannerBean.DataBean> data = bannerBean.getData();

         Gson gson = new Gson();
         String s = gson.toJson(data);
         mPresenter.Banner(s);


         FirstBean firstBean = new FirstBean();
         List<FirstBean.DataBean> first = firstBean.getData();
         String ff = gson.toJson(first);
          mPresenter.First(ff);


     }

    @Override
    protected void initView() {


        initEvent();

        params = getWindow().getAttributes();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rlv.setLayoutManager(linearLayoutManager);
        bannerBeans = new ArrayList<>();
        bannerReadapter = new BannerReadapter(bannerBeans,this);
        rlv.setAdapter(bannerReadapter);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void showBanner(BannerBean bannerBean) {
        Log.d(TAG, "showBanner: "+bannerBean.toString());
        List<BannerBean.DataBean> data = bannerBean.getData();
    }
    @Override
    public void showFirst(FirstBean bean) {
        List<FirstBean.DataBean> data = bean.getData();
        Log.d(TAG, "FirstBean: "+data);
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



   public  void initEvent(){


       fragments = new ArrayList<>();
       fragments.add(new HomeFragment());
       fragments.add(new FicationFragment());
       fragments.add(new AttentionFragment());
       fragments.add(new MyFragment());


       strings = new ArrayList<>();
       strings.add("首页");
       strings.add("分类");
       strings.add("关注");
       strings.add("我的");

       MainAdapter mainAdapter = new MainAdapter(fragments,strings,getSupportFragmentManager());
       vp.setAdapter(mainAdapter);


       rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id.shouye:
                       vp.setCurrentItem(0);
                       break;
                   case R.id.fenlei:
                       vp.setCurrentItem(1);
                       break;
                   case R.id.guanzhu:
                       vp.setCurrentItem(2);
                       break;
                   case R.id.wode:
                       vp.setCurrentItem(3);
                       break;
               }
           }
       });


       vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }
           @Override
           public void onPageSelected(int position) {
           switch (position){
               case 0:
                 rg.check(R.id.shouye);
                   break;
               case 1:
                   rg.check(R.id.fenlei);
                   break;
               case 2:
                   rg.check(R.id.guanzhu);
                   break;
               case 3:
                   rg.check(R.id.wode);
                   break;

           }

           }
           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
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
