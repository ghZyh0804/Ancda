package com.ancda.parents.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.ancda.parents.R;
import com.ancda.parents.presenter.PBasePager;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XLazyFragment;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * 作者：DELL-002 on 2018/5/5 09:34
 */
public class MeFragment extends XLazyFragment<PBasePager> {


    @BindView(R.id.btn111)
    AppCompatButton button;


    @Override
    public void initData(Bundle savedInstanceState) {


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showShare();
            }
        });

    }

    private void showShare() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // title标题，微信、QQ和QQ空间等平台使用
        oks.setTitle("分享");
        // titleUrl QQ和QQ空间跳转链接
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url在微信、微博，Facebook等平台中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网使用
        oks.setComment("我是测试评论文本");
        // 启动分享GUI
        oks.show(getActivity());
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

                break;


        }


    }


}
