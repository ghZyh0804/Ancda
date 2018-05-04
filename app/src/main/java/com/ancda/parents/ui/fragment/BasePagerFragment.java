package com.ancda.parents.ui.fragment;

import android.os.Bundle;

import com.ancda.parents.presenter.PBasePager;
import com.ancda.parents.weight.shinebuttonlib.StateView;

import cn.droidlover.xdroidmvp.mvp.XLazyFragment;
import cn.droidlover.xdroidmvp.net.NetError;

/**
 * Created by wanglei on 2016/12/31.
 */

public abstract class BasePagerFragment extends XLazyFragment<PBasePager> {


    StateView errorView;


    @Override
    public void initData(Bundle savedInstanceState) {

        getP().loadData(getType(), 1);
    }





    public abstract String getType();




    public void showError(NetError error) {
        if (error != null) {
            switch (error.getType()) {
                case NetError.ParseError:
                    errorView.setMsg("数据解析异常");
                    break;

                case NetError.AuthError:
                    errorView.setMsg("身份验证异常");
                    break;

                case NetError.BusinessError:
                    errorView.setMsg("业务异常");
                    break;

                case NetError.NoConnectError:
                    errorView.setMsg("网络无连接");
                    break;

                case NetError.NoDataError:
                    errorView.setMsg("数据为空");
                    break;

                case NetError.OtherError:
                    errorView.setMsg("其他异常");
                    break;
            }

        }
    }





    @Override
    public PBasePager newP() {
        return new PBasePager();
    }
}
