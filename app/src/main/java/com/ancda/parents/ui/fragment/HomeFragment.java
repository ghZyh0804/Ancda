package com.ancda.parents.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;


public class HomeFragment extends XLazyFragment<PBasePager> {

    @BindView(R.id.fab)
    FloatingActionButton floatingActionButton;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
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
