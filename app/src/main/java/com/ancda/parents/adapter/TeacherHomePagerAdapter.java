package com.ancda.parents.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 作者：DELL-002 on 2018/4/28 17:25
 * 园丁端首页adapter
 */
public class TeacherHomePagerAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public TeacherHomePagerAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}
