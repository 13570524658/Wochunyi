package com.wochunyi.wochunyi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.wochunyi.wochunyi.data.net.api.presenter.component.ApplicationComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.DaggerApplicationComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.module.ApplicationModule;
import com.wochunyi.wochunyi.data.net.exception.CommonErrorHelper;
import com.wochunyi.wochunyi.main.util.ToastUtil;


import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class AppApplication extends Application {
    public ApplicationComponent applicationComponent;
    public static List<Activity> activityList = new LinkedList<Activity>();

    public static AppApplication get(Context context){
        return (AppApplication)context.getApplicationContext();
    }
    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) {
                //异常处理
                CommonErrorHelper.handleCommonError(AppApplication.this,throwable);
            }
        });
        init();
    }

    private void init() {
        ToastUtil.init(this);
    }

    private void initializeInjector(){
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
    // 添加Activity 到容器中
    public void addActivity(Activity activity) {
        activityList.add(activity);
        System.out.println("size:"+activityList.size());
    }

}
