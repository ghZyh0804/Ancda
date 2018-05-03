package com.ancda.parents.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.ajguan.library.EasyRefreshLayout;
import com.ancda.parents.R;
import com.ancda.parents.adapter.DynamicFragmentAdapter;
import com.ancda.parents.presenter.DynamicFragmentPresenter;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;
import cn.droidlover.xstatecontroller.XStateController;

/**
 * Created by wanglei on 2016/12/31.
 */

public class DynamicFragment extends XLazyFragment<DynamicFragmentPresenter> {

    @BindView(R.id.easylayout)
    EasyRefreshLayout easyRefreshLayout;

    @BindView(R.id.controller)
    XStateController xStateController;

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;


    public static DynamicFragment newInstance() {
        return new DynamicFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        initAdapter();
        easyRefreshLayout.addEasyEvent(new EasyRefreshLayout.EasyEvent() {
            @Override
            public void onLoadMore() {

                getP().loadData("", "", "");
            }

            @Override
            public void onRefreshing() {
                getP().loadData("", "0", "");
            }
        });
        getP().loadData("", "", "");
    }

    private void initAdapter() {
        DynamicFragmentAdapter dynamicFragmentAdapter = new DynamicFragmentAdapter(null);
        dynamicFragmentAdapter.openLoadAnimation();
        recyclerView.setAdapter(dynamicFragmentAdapter);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_dynamic;
    }


    @Override
    public DynamicFragmentPresenter newP() {
        return new DynamicFragmentPresenter();
    }
}
