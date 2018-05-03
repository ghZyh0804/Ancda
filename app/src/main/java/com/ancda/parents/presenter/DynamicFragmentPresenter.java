package com.ancda.parents.presenter;


import com.ancda.parents.callback.JsonCallback;
import com.ancda.parents.model.DynamicFramentModel;
import com.ancda.parents.net.Api;
import com.ancda.parents.ui.fragment.DynamicFragment;
import com.ancda.parents.utils.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import cn.droidlover.xdroidmvp.mvp.XPresent;


public class DynamicFragmentPresenter extends XPresent<DynamicFragment> {
    public void loadData(String classId, String startPos, String roleid) {
        OkGo.<DynamicFramentModel>get(Api.ANCDA_API_BASE_URL + Urls.URL_DYNAMIC_LIST)//
                .tag(this)//
                .params("classid", classId)
                .params("start", startPos)
                .params("count", "10")
                .params("roleid", roleid)
                .execute(new JsonCallback<DynamicFramentModel>() {
                    @Override
                    public void onSuccess(Response<DynamicFramentModel> response) {

                    }

                    @Override
                    public void onError(Response<DynamicFramentModel> response) {
                        super.onError(response);

                    }
                });
    }
}
