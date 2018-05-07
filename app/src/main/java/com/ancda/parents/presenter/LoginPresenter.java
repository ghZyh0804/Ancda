package com.ancda.parents.presenter;


import com.ancda.parents.MyApp;
import com.ancda.parents.callback.JsonCallback;
import com.ancda.parents.model.ParentLoginModel;
import com.ancda.parents.model.StudentInfoModel;
import com.ancda.parents.net.Api;
import com.ancda.parents.ui.activity.LoginActivity;
import com.ancda.parents.utils.EncryptUtils;
import com.ancda.parents.utils.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import java.util.List;

import cn.droidlover.xdroidmvp.mvp.XPresent;

/**
 * 作者：zhangyunhong on 2016/12/31 13:30
 * 登录页面的presenter
 */
public class LoginPresenter extends XPresent<LoginActivity> {


    public void login(String userName, String password) {
        MyApp.getApplication().initOkGo(userName, "");
        getV().loginStart();
        OkGo.<ParentLoginModel>get(Api.ANCDA_API_BASE_URL + Urls.URL_LOGIN)//
                .tag(this)//
                .params("type", "parent")//
                .params("username", userName)//
                .params("userpassword", EncryptUtils.encryptMD5ToString(password))//
                .execute(new JsonCallback<ParentLoginModel>() {
                    @Override
                    public void onSuccess(Response<ParentLoginModel> response) {
                        getV().loginSuccessful();
                        ParentLoginModel parentLoginModel = response.body();
                        MyApp.parentLoginModel=parentLoginModel;
                        ParentLoginModel.DataBean dataBean = parentLoginModel.getData().get(0);
                        List<ParentLoginModel.DataBean.StudentsBean> students = dataBean.getStudents();
                        getV().showSlectStudentDialog(students);
                    }

                    @Override
                    public void onError(Response<ParentLoginModel> response) {
                        super.onError(response);
                        getV().loginError();
                    }
                });
    }

    public void autoLogin() {


    }

    public void switchStudents(String srudentId) {
        getV().loginStart();
        // {"newtime_schoolconfig":"1524717081","newtime_schoolinfo":"1524717081","newtime_babyinfo":"1524736707","studentid":"746391"}
        OkGo.<StudentInfoModel>post(Api.ANCDA_API_BASE_URL + Urls.URL_LOGIN_SELECT_STUDENT)//
                .tag(this)//
                .params("newtime_schoolconfig", "1524717081")//
                .params("newtime_schoolinfo", "1524717081")//
                .params("newtime_babyinfo", "1524736707")//
                .params("studentid", srudentId)//
                .execute(new JsonCallback<StudentInfoModel>() {

                    @Override
                    public void onSuccess(Response<StudentInfoModel> response) {
                        getV().loginSuccessful();
                        StudentInfoModel body = response.body();

                        MyApp.studentInfoModel=body;
                        if ("0".equals(body.getResult())) {
                            getV().getHomePage();
                        }
                    }

                    @Override
                    public void onError(Response<StudentInfoModel> response) {

                    }
                });

    }

    private void switchSchool() {






    }
}
