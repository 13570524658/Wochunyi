package com.wochunyi.wochunyi.data.net.api.presenter.module;

import android.content.Context;

import com.wochunyi.wochunyi.AppApplication;
import com.wochunyi.wochunyi.data.net.api.impl.ApiRepositoryImpl;
import com.wochunyi.wochunyi.data.net.api.repository.ApiRepository;
import com.wochunyi.wochunyi.data.net.thread.JobThread;
import com.wochunyi.wochunyi.data.net.thread.PostExecutionThread;
import com.wochunyi.wochunyi.data.net.thread.ThreadExecutor;
import com.wochunyi.wochunyi.data.net.thread.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
@Module
public class ApplicationModule {
    private final AppApplication appApplication;

    public ApplicationModule(AppApplication application) {
        this.appApplication = application;
    }

    @Provides
    @Singleton
    Context application(){
        return this.appApplication;
    }

    @Provides
    @Singleton
    ThreadExecutor threadExecutor(JobThread jobThread){
        return jobThread;
    }

    @Provides
    @Singleton
    PostExecutionThread postExecutionThread(UIThread uiThread){
        return uiThread;
    }

    @Provides
    @Singleton
    ApiRepository apiRepository(ApiRepositoryImpl repositoryImpl){
        return repositoryImpl;
    }
}
