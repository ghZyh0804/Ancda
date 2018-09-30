package com.ancda.parents.ui.fragment;

import android.os.Bundle;

import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;

import cn.droidlover.xdroidmvp.mvp.XLazyFragment;


public class HomeFragment extends XLazyFragment<PBasePager> {








    public static HomeFragment newInstance() {
        return new HomeFragment();
    }


    @Override
    public void initData(Bundle savedInstanceState) {



    }



    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public PBasePager newP() {
        return null;
    }
}
