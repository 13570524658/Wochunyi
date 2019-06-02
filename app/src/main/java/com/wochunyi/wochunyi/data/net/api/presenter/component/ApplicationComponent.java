package com.wochunyi.wochunyi.data.net.api.presenter.component;

import android.content.Context;

import com.wochunyi.wochunyi.data.net.api.presenter.module.ApplicationModule;
import com.wochunyi.wochunyi.data.net.api.repository.ApiRepository;
import com.wochunyi.wochunyi.data.net.thread.PostExecutionThread;
import com.wochunyi.wochunyi.data.net.thread.ThreadExecutor;
import com.wochunyi.wochunyi.main.ui.activity.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    //暴露给子层
    Context context();
    ThreadExecutor threadExecutor();
    PostExecutionThread postExecutionThread();
    ApiRepository apiRepository();
}
