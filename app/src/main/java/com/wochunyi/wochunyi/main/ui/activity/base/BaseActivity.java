package com.wochunyi.wochunyi.main.ui.activity.base;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.wochunyi.wochunyi.AppApplication;
import com.wochunyi.wochunyi.data.net.api.presenter.component.ApplicationComponent;
import com.wochunyi.wochunyi.data.net.api.presenter.module.ActivityModule;

/**
 * @author wochunyi
 * @date 2019-05-30.
 * GitHub：https://github.com/13570524658
 */
public abstract class BaseActivity extends AppCompatActivity {

    //声明一个long类型变量：用于存放上一点击“返回键”的时刻
    private long mExitTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppApplication.get(this).addActivity(this);
        ApplicationComponent applicationComponent = AppApplication.get(this).getApplicationComponent();
        applicationComponent.inject(this);
        this.setupActivityComponent(applicationComponent);
    }

    protected abstract void setupActivityComponent(ApplicationComponent applicationComponent);

    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //判断用户是否点击了“返回键”
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //与上次点击返回键时刻作差
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                //大于2000ms则认为是误操作，使用Toast进行提示
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                //并记录下本次点击“返回键”的时刻，以便下次进行判断
                mExitTime = System.currentTimeMillis();
            } else {
                //小于2000ms则认为是用户确实希望退出程序-调用System.exit()方法进行退出
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
