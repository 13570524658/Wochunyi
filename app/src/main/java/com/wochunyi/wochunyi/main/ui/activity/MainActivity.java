package com.wochunyi.wochunyi.main.ui.activity;

import android.os.Bundle;
import com.wochunyi.wochunyi.R;
import com.wochunyi.wochunyi.data.net.api.presenter.component.ApplicationComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.DaggerMainActivityComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.MainActivityComponent;
import com.wochunyi.wochunyi.data.net.api.view.SuserLoginView;
import com.wochunyi.wochunyi.main.ui.activity.base.BaseActivity;


public class MainActivity extends BaseActivity implements SuserLoginView {



    private MainActivityComponent component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setupActivityComponent(ApplicationComponent applicationComponent) {
        component = DaggerMainActivityComponent
                .builder()
                .applicationComponent(applicationComponent)
                .activityModule(getActivityModule())
                .build();
        component.inject(this);
    }

    @Override
    public void lodingSuserLoginView(boolean isSuccess, String result, String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
