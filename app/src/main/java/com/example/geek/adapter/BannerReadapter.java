package com.example.geek.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geek.MainActivity;
import com.example.geek.bean.BannerBean;

import java.util.ArrayList;

/**
 * name:&{宋佳羿}
 * date:2019/11/22
 * Time:14:25
 */
public class BannerReadapter extends RecyclerView.Adapter {
    private final ArrayList<BannerBean> bannerBeans;
    private final MainActivity mainActivity;

    public BannerReadapter(ArrayList<BannerBean> bannerBeans, MainActivity mainActivity) {
        this.bannerBeans=bannerBeans;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
