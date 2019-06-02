package com.wochunyi.wochunyi.data.net;


import android.content.Context;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.wochunyi.wochunyi.data.config.AppConifg;
import com.wochunyi.wochunyi.data.net.cookie.PersistentCookieStore;
import com.wochunyi.wochunyi.data.net.interceptor.CacheInterceptor;
import com.wochunyi.wochunyi.data.net.interceptor.HeaderInterceptor;

import java.io.File;
import java.lang.reflect.Type;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 * 网络请求客户端配置
 */
public class RetrofitClient {
    private OkHttpClient okHttpClient;
    private Retrofit retrofit;
    private Context context;
    private static String URL;


    public static RetrofitClient builder(Context context) {
        return new RetrofitClient(context);
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public RetrofitClient(Context context) {
        this.context = context;
        initConnectType();
        initOkHttpClient();
        initRetrofitClient();
    }

    public void initConnectType() {
        if (AppConifg.CONNECT_TYPE == 0) {
            URL = AppConifg.BASE_URL;
        } else if (AppConifg.CONNECT_TYPE == 1) {
            URL = AppConifg.DEV_BASE_URL;
        } else if (AppConifg.CONNECT_TYPE == 2) {
            URL = AppConifg.TEST_BASE_URL;
        }
    }

    public void initRetrofitClient() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement json, Type typeOfT
                    , JsonDeserializationContext context) throws JsonParseException {
                return new Date(json.getAsJsonPrimitive().getAsLong());
            }
        });

        retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .build();
    }

    public void initOkHttpClient() {
        HttpLoggingInterceptor mhttpLoggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
        // 指定缓存路径,缓存大小200Mb
        Cache mCache = new Cache(new File(context.getCacheDir(), AppConifg.APP_NAME + "_" + "HttpCache"), 1024 * 1024 * 200);
        CookieHandler cookieHandler = new CookieManager(new PersistentCookieStore(context), CookiePolicy.ACCEPT_ALL);
        okHttpClient = new OkHttpClient.Builder()
                .cookieJar(new JavaNetCookieJar(cookieHandler))
                .addInterceptor(new HeaderInterceptor())
                .addInterceptor(mhttpLoggingInterceptor)
                .addNetworkInterceptor(new CacheInterceptor())
                //缓存
                .cache(mCache)
                //断网重连
                .retryOnConnectionFailure(true)
                //链接超时
                .connectTimeout(10, TimeUnit.SECONDS)
                //读取超时
                .readTimeout(30, TimeUnit.SECONDS)
                .build();

    }
}
