package com.example.geek.base;

import java.util.ArrayList;

public abstract class BasePeresenter<V extends BaseView> {

    protected V view;


    protected ArrayList<BaseModel> models = new ArrayList<>();

    public BasePeresenter() {
        initModel();
    }


    protected abstract void initModel();

    public void bind(V view) {
        this.view = view;
    }

    public void onDestory() {
        view = null;
        if (models.size() > 0) {
            for (BaseModel models : models
            ) {
                models.onDestory();
            }

        }
    }

}
