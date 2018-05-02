package com.ancda.parents.ui.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.ancda.parents.R;
import com.ancda.parents.adapter.HomeAdapter;
import com.ancda.parents.adapter.HomeFragmentAdapter;
import com.ancda.parents.model.HomeItem;
import com.ancda.parents.presenter.PBasePager;
import com.ancda.parents.weight.ColorArcProgressBar;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;


public class HomeFragment extends XLazyFragment<PBasePager> {


    @BindView(R.id.rv_list)
    RecyclerView recyclerView;

    @BindView(R.id.cpb_progress)
    ColorArcProgressBar progress;


    private ArrayList<String> mDataList;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        mDataList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            mDataList.add("测试数据1");
        }

        initAdapter();


        progress.setCurrentValues(20);


    }

    private void initAdapter() {
        BaseQuickAdapter homeAdapter = new HomeFragmentAdapter(R.layout.home_item_view, mDataList);
        homeAdapter.openLoadAnimation();
       /* View top = getLayoutInflater().inflate(R.layout.top_view, (ViewGroup) mRecyclerView.getParent(), false);
        homeAdapter.addHeaderView(top);*/
        recyclerView.setAdapter(homeAdapter);
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
