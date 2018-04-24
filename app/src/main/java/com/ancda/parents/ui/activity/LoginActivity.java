package com.ancda.parents.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ancda.parents.R;
import com.ancda.parents.presenter.LoginPresenter;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XActivity;


/**
 *
 */
public class LoginActivity extends XActivity implements View.OnClickListener {


    @BindView(R.id.text_account)
    EditText textAccount;
    @BindView(R.id.del_account)
    ImageView delAccount;

    @BindView(R.id.text_password)
    EditText textPassword;
    @BindView(R.id.del_pwd)
    ImageView delPwd;

    @BindView(R.id.btn_done)
    Button btnDone;
    @BindView(R.id.tv_regist)
    TextView tvRegist;
    @BindView(R.id.lbl_forgot_password)
    TextView lblForgotPassword;

    @BindView(R.id.login_bg)
    RelativeLayout loginBg;
    @BindView(R.id.activity_layout)
    ScrollView activityLayout;


    @Override
    public void initData(Bundle savedInstanceState) {

        final View activityRootView = findViewById(R.id.login_bg);
        activityRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //比较Activity根布局与当前布局的大小
                int heightDiff = activityRootView.getRootView().getHeight() - activityRootView.getHeight();
                if (heightDiff > 100) { //显示键盘
                    activityLayout.smoothScrollTo(0, heightDiff);
                }
            }
        });

        btnDone.setOnClickListener(this);


    }



    @Override
    public int getLayoutId() {

        return R.layout.activity_login;

    }

    @Override
    public LoginPresenter newP() {
        return new LoginPresenter();
    }

    @Override
    protected LoginPresenter getP() {
        return (LoginPresenter) super.getP();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_done:
               // getP().login();




                break;

        }
    }






}

