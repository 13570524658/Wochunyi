package com.wochunyi.wochunyi.data.net.api.presenter.module;

import android.app.Activity;

import com.wochunyi.wochunyi.data.net.api.presenter.component.base.DaggerActivity;
import com.wochunyi.wochunyi.main.util.JsonSerializerUtil;

import dagger.Module;
import dagger.Provides;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
@Module
public class ActivityModule {
    private Activity activity;
    public ActivityModule(Activity activity) {
        this.activity = activity;
    }
    @Provides
    @DaggerActivity
    Activity activity(){
        return this.activity;
    }

    @Provides
    @DaggerActivity
    JsonSerializerUtil provideJsonSerializer(){
        return new JsonSerializerUtil();
    }

}