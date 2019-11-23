package com.example.geek.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.geek.MainActivity;
import com.example.geek.R;
import com.example.geek.bean.BannerBean;


import java.util.ArrayList;

/**
 * name:&{宋佳羿}
 * date:2019/11/22
 * Time:14:25
 */
public class BannerReadapter extends RecyclerView.Adapter {
    private final ArrayList<BannerBean.DataBean> bannerBeans;
    private final MainActivity mainActivity;

    public BannerReadapter(ArrayList<BannerBean.DataBean> bannerBeans, MainActivity mainActivity) {
        this.bannerBeans=bannerBeans;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.item_banner, null, false);
        return new Myhold(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
         Myhold myhold= (Myhold) holder;
        Glide.with(mainActivity).load(bannerBeans.get(position)).into(myhold.ImageView);
    }

    @Override
    public int getItemCount() {
        return bannerBeans.size();
    }
    class Myhold extends  RecyclerView.ViewHolder {

        private final ImageView ImageView;

        public Myhold(@NonNull View itemView) {
            super(itemView);
            ImageView = itemView.findViewById(R.id.banner);
        }


    }
}
