package com.wochunyi.wochunyi.data.net.interceptor;

import com.wochunyi.wochunyi.main.util.NetUtil;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 */
public class CacheInterceptor implements Interceptor {
    NetUtil netUtil;
    //短缓存有效期为2分钟
    public static final int CACHE_STALE_SHORT = 60 * 2;
    //长缓存有效期为7天
    public static final int CACHE_STALE_LONG = 60 * 60 * 24 * 7;

    public static final String CACHE_CONTROL_AGE = "Cache-Control: public, max-age=";

    public static final String CACHE_CONTROL_NO_CACHE = "Cache-Control: no-cache";


    //查询缓存的Cache-Control设置，为if-only-cache时只查询缓存而不会请求服务器，max-stale可以配合设置缓存失效时间
    public static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_LONG;
    //查询网络的Cache-Control设置，头部Cache-Control设为max-age=0时则不会使用缓存而请求服务器
    public static final String CACHE_CONTROL_NETWORK = "max-age=0";


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
         netUtil=new NetUtil();
        if (!netUtil.isNetworkConnected()) {
            request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
        }
        Response originalResponse = chain.proceed(request);
        if (netUtil.isNetworkConnected()) {
            //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
            String cacheControl = request.cacheControl().toString();
            return originalResponse.newBuilder()
                    .header("Cache-Control", cacheControl)
                    .removeHeader("Pragma").build();
        } else  {
            //没有网络读取缓存信息
            return originalResponse.newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + CACHE_STALE_LONG)
                    .removeHeader("Pragma").build();
        }
    }
}
