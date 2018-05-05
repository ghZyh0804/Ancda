package com.ancda.parents.ui.fragment;

import android.os.Bundle;

import com.ancda.parents.MainActivity;
import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;

import cn.droidlover.xdroidmvp.mvp.XLazyFragment;

/**
 * 作者：DELL-002 on 2018/5/5 09:34
 */
public class MeFragment extends XLazyFragment<PBasePager> {

    @Override
    public void initData(Bundle savedInstanceState) {
        ((MainActivity) getActivity()).transparent19and20();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_me;
    }

    public static MeFragment newInstance() {
        return new MeFragment();
    }


    @Override
    public PBasePager newP() {
        return null;
    }

}
