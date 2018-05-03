package com.ancda.parents.adapter;

import com.ancda.parents.R;
import com.ancda.parents.model.DynamicFramentModel;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class DynamicFragmentAdapter extends BaseMultiItemQuickAdapter<DynamicFramentModel, BaseViewHolder>   {


     private static final int ITEM_VIEW_TYPE_01 = 1;
     private static final int ITEM_VIEW_TYPE_02 = 2;
     private static final int ITEM_VIEW_TYPE_03 = 3;


    public DynamicFragmentAdapter(List<DynamicFramentModel> data) {
        super(data);
        addItemType(ITEM_VIEW_TYPE_01, R.layout.adapter_dynamic_new1);
        addItemType(ITEM_VIEW_TYPE_02, R.layout.adapter_dynamic_new2);
        addItemType(ITEM_VIEW_TYPE_03, R.layout.adapter_dynamic_new3);
    }


    @Override
    protected void convert(BaseViewHolder helper, DynamicFramentModel item) {

        switch (helper.getItemViewType()) {
            case ITEM_VIEW_TYPE_01:
                break;
            case ITEM_VIEW_TYPE_02:


                break;
            case ITEM_VIEW_TYPE_03:

                break;
        }


        helper.addOnClickListener(R.id.btnLike);
        helper.addOnClickListener(R.id.btnComment);


    }

}