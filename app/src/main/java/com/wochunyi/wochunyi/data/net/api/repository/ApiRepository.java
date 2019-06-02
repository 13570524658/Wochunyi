package com.wochunyi.wochunyi.data.net.api.repository;

import com.wochunyi.wochunyi.data.entity.bean.Result;
import com.wochunyi.wochunyi.data.entity.bean.SuserLogin;

import io.reactivex.Observable;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public interface ApiRepository {
    Observable<Result<SuserLogin>> suserLogin(String phone, String password, String clientid);
}
