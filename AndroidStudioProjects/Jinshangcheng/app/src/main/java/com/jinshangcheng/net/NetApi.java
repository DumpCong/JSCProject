package com.jinshangcheng.net;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * 自定义接口 提供各种请求方法
 */
public interface NetApi {

    /**
     * 登录
     *
     * @param workerCode
     * @param password
     * @param type
     * @return
     */
    @FormUrlEncoded
    @POST("login")
    Observable<Object> login(@Field("content") String content,
                             @Field("uuid") String uuid);


}
