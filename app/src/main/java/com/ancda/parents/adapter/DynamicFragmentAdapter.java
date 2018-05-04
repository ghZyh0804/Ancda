package com.ancda.parents.adapter;

import android.support.v7.widget.AppCompatImageView;

import com.ancda.parents.R;
import com.ancda.parents.model.TestModel;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cn.droidlover.xdroidmvp.imageloader.ILFactory;

public class DynamicFragmentAdapter extends BaseMultiItemQuickAdapter<TestModel, BaseViewHolder> {


    public DynamicFragmentAdapter(List<TestModel> data) {
        super(data);
        addItemType(TestModel.ITEM_VIEW_TYPE_01, R.layout.item_test01);
        addItemType(TestModel.ITEM_VIEW_TYPE_02, R.layout.item_test02);

    }


    @Override
    protected void convert(BaseViewHolder helper, TestModel item) {

        switch (helper.getItemViewType()) {
            case TestModel.ITEM_VIEW_TYPE_01:
                helper.setText(R.id.textView1, item.text);
                break;
            case TestModel.ITEM_VIEW_TYPE_02:
                ILFactory.getLoader().loadNet((AppCompatImageView) helper.getView(R.id.img), item.url, null);
                break;

        }


    }

}