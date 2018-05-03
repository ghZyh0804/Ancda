package com.ancda.parents.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ancda.parents.R;
import com.ancda.parents.adapter.HomeFragmentAdapter;
import com.ancda.parents.presenter.PBasePager;
import com.ancda.parents.utils.BarChartManager;
import com.ancda.parents.weight.ColorArcProgressBar;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.github.mikephil.charting.charts.BarChart;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;


public class HomeFragment extends XLazyFragment<PBasePager> {


    @BindView(R.id.rv_list)
    RecyclerView recyclerView;

    @BindView(R.id.cpb_progress)
    ColorArcProgressBar progress;

    @BindView(R.id.bar_chart1)
    BarChart bar_chart1;


    private ArrayList<String> mDataList;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    protected String[] values = new String[]{
            "Jan", "Feb", "Mar", "Apr", "May"
    };

    @Override
    public void initData(Bundle savedInstanceState) {

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        mDataList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            mDataList.add("测试数据1");
        }

        initAdapter();
        progress.setCurrentValues(20);
        BarChartManager barChartManager1 = new BarChartManager(bar_chart1);


        //设置x轴的数据
        ArrayList<Float> xValues = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            xValues.add((float) i);
        }


        //设置y轴的数据()
        List<List<Float>> yValues = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            List<Float> yValue = new ArrayList<>();
            for (int j = 0; j <= 10; j++) {
                yValue.add((float) (Math.random() * 80));
            }
            yValues.add(yValue);
        }


        //颜色集合
        List<Integer> colours = new ArrayList<>();
        colours.add(Color.GREEN);
        colours.add(Color.BLUE);
        colours.add(Color.RED);
        colours.add(Color.CYAN);


        //创建多条折线的图表
        barChartManager1.showBarChart(xValues, yValues.get(0), "", colours.get(3));

        bar_chart1.invalidate();
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
