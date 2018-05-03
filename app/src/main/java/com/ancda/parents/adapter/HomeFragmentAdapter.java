package com.ancda.parents.adapter;

import com.ancda.parents.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class HomeFragmentAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public HomeFragmentAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {


        helper.setText(R.id.text, item);
    }
}