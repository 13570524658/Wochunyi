package com.wochunyi.wochunyi.data.net.api;

import com.wochunyi.wochunyi.data.config.ApiPathConfig;
import com.wochunyi.wochunyi.data.entity.bean.Result;
import com.wochunyi.wochunyi.data.entity.bean.SuserLogin;
import com.wochunyi.wochunyi.data.net.interceptor.CacheInterceptor;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public interface ApiService {
    //登录
    @Headers(CacheInterceptor.CACHE_CONTROL_NO_CACHE)
    @FormUrlEncoded
    @POST(ApiPathConfig.SUSER_LOGIN)
    Observable<Result<SuserLogin>> suserLogin(
            @Field("phone") String phone,
            @Field("password") String password,
            @Field("clientid") String clientid);
}
