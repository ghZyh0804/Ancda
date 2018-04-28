package com.ancda.parents.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;


public class HomeFragment extends XLazyFragment<PBasePager> {

    @BindView(R.id.rl_home)
    RecyclerView recyclerView;


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
