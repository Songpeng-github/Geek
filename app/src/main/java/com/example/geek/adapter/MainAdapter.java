package com.example.geek.adapter;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * name:宋佳羿
 * date:2019/11/23
 * Time:14:56
 */
public class MainAdapter extends FragmentPagerAdapter {

    private final ArrayList<String> strings;
    private final ArrayList<Fragment> fragments;

    public MainAdapter(ArrayList<Fragment> fragments, ArrayList<String> strings, @NonNull FragmentManager fm) {
        super(fm);
        this.strings=strings;
        this.fragments=fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
    @Override
    public int getCount() {
        return fragments.size();
    }
}
