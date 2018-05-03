package com.ancda.parents.net;

import com.ancda.parents.model.DynamicFramentModel;
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


   /*  params.put("classid", classesQueryString);
            params.put("start", "" + nextListPosition);
            params.put("count", "" + count);
    // 角色ID 1-园长 2-教师 3-家长 当不带roleid或roleid为空获取所有。
            params.put("roleid", roleid);*/

    @GET("openaction/getclassaction?")
    Flowable<DynamicFramentModel> getDynamicList(String classId, String startPos, String count, String roleid);

}
