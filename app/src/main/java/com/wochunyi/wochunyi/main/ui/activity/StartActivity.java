package com.wochunyi.wochunyi.main.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wochunyi.wochunyi.R;
import com.wochunyi.wochunyi.data.net.api.presenter.component.ApplicationComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.DaggerStartActivityComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.StartActivityComponent;
import com.wochunyi.wochunyi.main.ui.activity.base.BaseActivity;
import com.wochunyi.wochunyi.main.util.RxPermissionsUtil;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 */
public class StartActivity extends BaseActivity {
    private StartActivityComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        RxPermissionsUtil.rxPermissions(this);
    }

    @Override
    protected void setupActivityComponent(ApplicationComponent applicationComponent) {
        component = DaggerStartActivityComponent
                .builder()
                .applicationComponent(applicationComponent)
                .activityModule(getActivityModule())
                .build();
        component.inject(this);
    }

}
