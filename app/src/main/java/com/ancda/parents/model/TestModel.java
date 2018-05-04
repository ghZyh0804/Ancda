package com.ancda.parents.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * 作者：DELL-002 on 2018/5/4 15:50
 */
public class TestModel implements MultiItemEntity {

    public static final int ITEM_VIEW_TYPE_01 = 1;
    public static final int ITEM_VIEW_TYPE_02 = 2;

   public int type;

   public String text;

   public String url;


    @Override
    public int getItemType() {
        return type;
    }

    


}
