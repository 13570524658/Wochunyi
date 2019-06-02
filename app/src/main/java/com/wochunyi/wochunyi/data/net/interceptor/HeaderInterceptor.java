package com.wochunyi.wochunyi.data.net.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 * 请求头拦截器
 */
public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder requestBuilder = original.newBuilder()
                .header("charset", "utf-8");
//                .header("Cookie", "JSESSIONID=" + token);
        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
}
