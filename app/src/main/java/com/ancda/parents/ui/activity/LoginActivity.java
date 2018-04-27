package com.ancda.parents.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ancda.parents.MainActivity;
import com.ancda.parents.R;
import com.ancda.parents.adapter.SelectStudentAdapter;
import com.ancda.parents.model.ParentLoginModel;
import com.ancda.parents.presenter.LoginPresenter;
import com.ancda.parents.utils.ToastUtils;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.List;

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

    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_regist)
    TextView tvRegist;
    @BindView(R.id.tv_forgot_password)
    TextView lblForgotPassword;

    @BindView(R.id.login_bg)
    RelativeLayout loginBg;
    @BindView(R.id.activity_layout)
    ScrollView activityLayout;
    @BindView(R.id.aiv_loading)
    AVLoadingIndicatorView aivLoading;


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

        btnLogin.setOnClickListener(this);


    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    public void showLoadingView() {
        aivLoading.setVisibility(View.VISIBLE);
    }

    public void hideLoadingView() {
        btnLogin.setEnabled(true);
        aivLoading.setVisibility(View.GONE);
    }


    public void loginStart() {
        btnLogin.setEnabled(false);
        showLoadingView();
    }

    public void loginSuccessful() {
        hideLoadingView();
    }

    public void loginError() {
        hideLoadingView();
        btnLogin.setEnabled(true);
    }

    public void getHomePage() {
        MainActivity.runActivity(this);

    }

    public void showSlectStudentDialog(final List<ParentLoginModel.DataBean.StudentsBean> studentsModel) {
        new AlertDialog.Builder(this).
                setAdapter(new SelectStudentAdapter(studentsModel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getP().switchStudents(studentsModel.get(which).getStudentid());
                    }
                })
                .create().show();

    }


    @Override
    public LoginPresenter newP() {
        return new LoginPresenter();
    }

    @Override
    protected LoginPresenter getP() {
        return (LoginPresenter) super.getP();
    }

    /* @OnClick({
             R.id.btn_login,
             R.id.tv_regist,
             R.id.tv_regist,
             R.id.lbl_forgot_password,
     })*/
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                String usrPhone = textAccount.getText().toString().trim();
                String password = textPassword.getText().toString().trim();
                if (TextUtils.isEmpty(usrPhone)) {
                    ToastUtils.showShortToast(R.string.prompt_user_name_empty);
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    ToastUtils.showShortToast(R.string.prompt_user_password);
                    return;
                }
                getP().login(usrPhone, password);
                break;
        }
    }


}

