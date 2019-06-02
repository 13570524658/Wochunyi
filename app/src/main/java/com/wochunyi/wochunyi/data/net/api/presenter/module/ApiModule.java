package com.wochunyi.wochunyi.data.net.api.presenter.module;

import com.wochunyi.wochunyi.data.net.api.cases.SuserLoginCase;
import com.wochunyi.wochunyi.data.net.api.cases.base.Case;
import com.wochunyi.wochunyi.data.net.api.presenter.component.base.DaggerActivity;
import com.wochunyi.wochunyi.data.net.api.repository.ApiRepository;
import com.wochunyi.wochunyi.data.net.thread.PostExecutionThread;
import com.wochunyi.wochunyi.data.net.thread.ThreadExecutor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
@Module
public class ApiModule {
    @Provides
    @DaggerActivity
    @Named("suserLogin")
    Case suserLoginCase(ThreadExecutor threadExecutor
            , PostExecutionThread postExecutionThread,ApiRepository repository) {
        return new SuserLoginCase(threadExecutor, postExecutionThread,repository);
    }
}
