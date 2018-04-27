package com.ancda.parents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.ancda.parents.ui.fragment.GanhuoFragment;
import com.ancda.parents.ui.fragment.GirlFragment;
import com.ancda.parents.ui.fragment.HomeFragment;
import com.yinglan.alphatabs.AlphaTabsIndicator;
import com.yinglan.alphatabs.OnTabChangedListner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.base.XFragmentAdapter;
import cn.droidlover.xdroidmvp.mvp.XActivity;

public class MainActivity extends XActivity implements OnTabChangedListner {


    public static void runActivity(Activity context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
        context.finish();
    }

    List<Fragment> homepageFramentList = new ArrayList<>();
    @BindView(R.id.vp_homepager)
    ViewPager viewPager;

    @BindView(R.id.ati_table)
    AlphaTabsIndicator alphaTabsIndicator;

    private XFragmentAdapter adapter;

    @Override
    public void initData(Bundle savedInstanceState) {

        homepageFramentList.clear();
        homepageFramentList.add(HomeFragment.newInstance());
        homepageFramentList.add(GirlFragment.newInstance());
        homepageFramentList.add(GanhuoFragment.newInstance());
        //homepageFramentList.add(Test4Fragment.newInstance());
        // homepageFramentList.add(Test5Fragment.newInstance());

        if (adapter == null) {
            adapter = new XFragmentAdapter(getSupportFragmentManager(), homepageFramentList, null);
        }
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);

        // alphaTabsIndicator.setViewPager(viewPager);                     //设置ViewPager
        //  alphaTabsIndicator.setOnTabChangedListner(this);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Object newP() {
        return null;
    }

    @Override
    public void onTabSelected(int tabNum) {
        viewPager.setCurrentItem(tabNum);


        Log.d("AAA", "角标:" + tabNum);
    }
}
