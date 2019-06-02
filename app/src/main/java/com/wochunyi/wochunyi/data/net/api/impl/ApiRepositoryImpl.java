package com.wochunyi.wochunyi.data.net.api.impl;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.wochunyi.wochunyi.data.entity.bean.Result;
import com.wochunyi.wochunyi.data.entity.bean.SuserLogin;
import com.wochunyi.wochunyi.data.net.RetrofitClient;
import com.wochunyi.wochunyi.data.net.api.ApiService;
import com.wochunyi.wochunyi.data.net.api.repository.ApiRepository;
import com.wochunyi.wochunyi.main.util.JsonSerializerUtil;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class ApiRepositoryImpl implements ApiRepository {
    public final static String TAG = ApiRepositoryImpl.class.getSimpleName();
    private Context  context;
    private JsonSerializerUtil jsonSerializerUtil;

    @Inject
    public ApiRepositoryImpl(Context context, JsonSerializerUtil jsonSerializerUtil) {
        this.context = context;
        this.jsonSerializerUtil = jsonSerializerUtil;
    }

    @Override
    public Observable<Result<SuserLogin>> suserLogin(String phone, String password, String clientid) {
        Observable observable =  RetrofitClient.builder(context)
                .getRetrofit().create(ApiService.class)
                .suserLogin(phone,password,clientid);
        Log.e(TAG+"/suserLogin",new Gson().toJson(observable));
        return  observable;
    }
}
