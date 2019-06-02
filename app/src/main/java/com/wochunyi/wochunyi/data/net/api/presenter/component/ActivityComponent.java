package com.wochunyi.wochunyi.data.net.api.presenter.component;

import android.app.Activity;

import com.wochunyi.wochunyi.data.net.api.presenter.module.ActivityModule;
import com.wochunyi.wochunyi.data.net.api.presenter.component.base.DaggerActivity;

import dagger.Component;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
@DaggerActivity
@Component(modules = ActivityModule.class,dependencies = ApplicationComponent.class)
public interface ActivityComponent {
    Activity activity();
}
