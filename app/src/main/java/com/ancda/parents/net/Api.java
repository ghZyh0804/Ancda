package com.ancda.parents.net;

import cn.droidlover.xdroidmvp.net.XApi;

/**
 * Created by wanglei on 2016/12/31.
 */

public class Api {
    public static final String API_BASE_URL = "http://gank.io/api/";

    public static final String ANCDA_API_BASE_URL = "https://pbtest.ancda.com/";

    private static GankService gankService;

    public static GankService getGankService() {
        if (gankService == null) {
            synchronized (Api.class) {
                if (gankService == null) {
                    gankService = XApi.getInstance().getRetrofit(ANCDA_API_BASE_URL, true).create(GankService.class);
                }
            }
        }
        return gankService;
    }
}
