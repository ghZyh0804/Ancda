package com.ancda.parents.net;

import com.ancda.parents.model.GankResults;
import com.ancda.parents.model.ParentLoginModel;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by wanglei on 2016/12/31.
 */

public interface GankService {

    @GET("data/{type}/{number}/{page}")
    Flowable<GankResults> getGankData(@Path("type") String type,
                                      @Path("number") int pageSize,
                                      @Path("page") int pageNum);


    @GET("openuser/userlogin?type=parent&username=13049819524&userpassword=96e79218965eb72c92a549dd5a330112")
    Flowable<ParentLoginModel> parentLogin();


}
