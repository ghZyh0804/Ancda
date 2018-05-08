package com.ancda.parents.ui.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.ancda.parents.MyApp;
import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;
import com.ancda.parents.utils.ToastUtils;

import java.io.File;
import java.util.List;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;
import me.nereo.multi_image_selector.MultiImageSelectorActivity;

/**
 * 作者：DELL-002 on 2018/5/5 09:34
 */
public class MeFragment extends XLazyFragment<PBasePager> {



    @BindView(R.id.btn111)
    AppCompatButton btn;


    @Override
    public void initData(Bundle savedInstanceState) {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

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


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 1006:
                if (resultCode == Activity.RESULT_OK) {
                    List<String> path = data.getStringArrayListExtra(MultiImageSelectorActivity.EXTRA_RESULT);
                    if(path!=null && path.size()>0){
                    return;
                    }
                    ToastUtils.showShortToast(path.get(0));

                }

                break;


        }


    }

    public static File getExternalCacheDir() {

        final String cacheDir = "/Android/data/" + MyApp.getApplication().getPackageName() + "/cache/test.png";
        return new File(Environment.getExternalStorageDirectory().getPath() + cacheDir);
    }
}
