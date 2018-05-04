package com.ancda.parents.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ajguan.library.EasyRefreshLayout;
import com.ancda.parents.R;
import com.ancda.parents.adapter.DynamicFragmentAdapter;
import com.ancda.parents.model.TestModel;
import com.ancda.parents.presenter.DynamicFragmentPresenter;

import java.util.ArrayList;
import java.util.List;

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
    private DynamicFragmentAdapter dynamicFragmentAdapter;


    public static DynamicFragment newInstance() {
        return new DynamicFragment();
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        initAdapter();
        easyRefreshLayout.addEasyEvent(new EasyRefreshLayout.EasyEvent() {
            @Override
            public void onLoadMore() {

                final List<TestModel> testModels = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    TestModel testModel = new TestModel();
                    if (i % 2 == 0) {
                        testModel.type = TestModel.ITEM_VIEW_TYPE_01;
                        testModel.text = "测试文本" + i;
                    } else {
                        testModel.type = TestModel.ITEM_VIEW_TYPE_02;
                        testModel.url = "https://www.baidu.com/img/bd_logo1.png";
                    }
                    testModels.add(testModel);
                }


                easyRefreshLayout.loadMoreComplete(new EasyRefreshLayout.Event() {
                    @Override
                    public void complete() {

                        dynamicFragmentAdapter.addData(testModels);
                    }
                }, 500);
            }

            @Override
            public void onRefreshing() {

                List<TestModel> testModels = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    TestModel testModel = new TestModel();
                    if (i % 2 == 0) {
                        testModel.type = TestModel.ITEM_VIEW_TYPE_01;
                        testModel.text = "测试文本" + i;
                    } else {
                        testModel.type = TestModel.ITEM_VIEW_TYPE_02;
                        testModel.url = "https://www.baidu.com/img/bd_logo1.png";
                    }
                    testModels.add(testModel);
                }
                dynamicFragmentAdapter.addData(testModels);

                easyRefreshLayout.refreshComplete();
            }
        });


        inData();

    }

    private void inData() {

        List<TestModel> testModels = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            TestModel testModel = new TestModel();
            if (i % 2 == 0) {
                testModel.type = TestModel.ITEM_VIEW_TYPE_01;
                testModel.text = "测试文本" + i;
            } else {
                testModel.type = TestModel.ITEM_VIEW_TYPE_02;
                testModel.url = "https://www.baidu.com/img/bd_logo1.png";
            }
            testModels.add(testModel);
        }
        dynamicFragmentAdapter.addData(testModels);

    }

    private void initAdapter() {
        dynamicFragmentAdapter = new DynamicFragmentAdapter(null);
        dynamicFragmentAdapter.openLoadAnimation();

        final LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(dynamicFragmentAdapter);
        xStateController.showContent();
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
