package com.wochunyi.wochunyi.main.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

import com.wochunyi.wochunyi.R;
import com.wochunyi.wochunyi.data.net.api.presenter.SuserLoginPresenter;
import com.wochunyi.wochunyi.data.net.api.presenter.component.ApplicationComponent;
//import com.wochunyi.wochunyi.data.net.api.presenter.component.LoginActivityComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.DaggerLoginActivityComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.component.LoginActivityComponent;
import com.wochunyi.wochunyi.data.net.api.view.SuserLoginView;
import com.wochunyi.wochunyi.main.ui.activity.base.BaseActivity;

import javax.inject.Inject;



/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class LoginActivity extends BaseActivity implements SuserLoginView {
    EditText etUserAccount;
    EditText etUserPassword;
    Button btnLogin;
    LoginActivityComponent component;
    @Inject
    SuserLoginPresenter suserLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserAccount=findViewById(R.id.et_userAccount);
        etUserPassword=findViewById(R.id.et_userPassword);
        btnLogin=findViewById(R.id.btn_login);
        suserLoginPresenter.setView(this);
        netData();
        click();
    }

    private void click() {
        btnLogin.setOnClickListener(v -> {
            suserLoginPresenter.suserLogin(
                    etUserAccount.getText().toString(),
                    etUserPassword.getText().toString(),
                    "");
        });
    }

    private void netData() {

    }

    @Override
    protected void setupActivityComponent(ApplicationComponent applicationComponent) {
        component = DaggerLoginActivityComponent
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
