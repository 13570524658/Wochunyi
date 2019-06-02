package com.wochunyi.wochunyi.data.net.api.presenter.component;

import com.wochunyi.wochunyi.data.net.api.presenter.component.base.DaggerActivity;
import com.wochunyi.wochunyi.data.net.api.presenter.module.ActivityModule;
import com.wochunyi.wochunyi.data.net.api.presenter.module.ApiModule;
import com.wochunyi.wochunyi.main.ui.activity.LoginActivity;

import dagger.Component;

/**
 * @author wochunyi
 * @date 2019-06-02.
 * GitHub：https://github.com/13570524658
 */
@DaggerActivity
@Component(modules = {ActivityModule.class, ApiModule.class},dependencies = ApplicationComponent.class)
public interface LoginActivityComponent {
    void inject(LoginActivity startActivity);
}
