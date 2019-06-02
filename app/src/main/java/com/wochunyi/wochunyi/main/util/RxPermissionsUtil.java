package com.wochunyi.wochunyi.main.util;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.AppOpsManagerCompat;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

import com.tbruyelle.rxpermissions2.RxPermissions;
import com.wochunyi.wochunyi.main.ui.activity.LoginActivity;
import com.wochunyi.wochunyi.main.ui.activity.MainActivity;
import com.wochunyi.wochunyi.main.ui.activity.StartActivity;

import io.reactivex.annotations.NonNull;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class RxPermissionsUtil {
    private static Context mContext;


    @SuppressLint("CheckResult")
    public static void rxPermissions(final Context context) {
        mContext = context.getApplicationContext();
        RxPermissions rxPermissions = new RxPermissions((FragmentActivity) context); // where this is an Activity instance

            rxPermissions
                    .requestEach(
                            Manifest.permission.ACCESS_NETWORK_STATE,
                            Manifest.permission.INTERNET,
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.CALL_PHONE,
                            Manifest.permission.RECORD_AUDIO,
                            Manifest.permission.READ_SMS,
                            Manifest.permission.RECEIVE_SMS,
                            Manifest.permission.SEND_SMS,
                            Manifest.permission.CAMERA)
                    .subscribe(permission -> {
                        if (permission.granted) {
                            // 用户已经同意该权限
                            Log.e("允许权限", permission.name);
                            //bug 随便跳转一下
                            if (permission.name.equals("android.permission.CAMERA")){
                                Intent intent=new Intent(mContext, LoginActivity.class);
                                mContext.startActivity(intent);
                            }
                            //todo somthing
                        } else if (permission.shouldShowRequestPermissionRationale) {
                            // 用户拒绝了该权限，没有选中『不再询问』（Never ask again）,那么下次再次启动时，还会提示请求权限的对话框
                            Log.e("拒绝权限，等待下次询问", permission.name);
                            ToastUtil.show("拒绝权限，等待下次询问");
                            //todo request permission again
                        } else {
                            // 用户拒绝了该权限，并且选中『不再询问』
                            Log.e("拒绝权限,不再出询问弹框", "前往APP应用设置中打开此权限");
                            ToastUtil.show("拒绝权限，不再弹出询问框，前往APP应用设置中打开此权限");
                            openAppSettings();
                            //todo nothing
                        }
                    });
        }



    /**
     * 没有授权成功时测试
     * Android6.0权限申请后再判断原生的权限是否真的被授权--适配部分国产机型（小米、华为、vivo、oppo等）
     * AppOpsManager 即权限检测适配
     * Android 动态权限检测适配，对于我来说，是被按在地上摩擦摩擦。
     * AppOpsManager 针对Android权限动态检测提出一种解决方案。
     * AppOpsManager是在api 19引入,即Android 4.3
     * Google在Android开发者手册对AppPosManager的描述为 API for interacting with "application operation" tracking
     * AppOpsManager这一解决方案在某些机型上依旧不能适配的问题，Google也只能表示我能怎么办,我也很绝望
     *
     * @param context
     * @param permissions
     * @return
     */
    private static boolean hasOpsPermission(@NonNull Context context, @NonNull String... permissions) {
        for (String permission : permissions) {
            String op = AppOpsManagerCompat.permissionToOp(permission);
            int result = AppOpsManagerCompat.noteProxyOp(context, op, context.getPackageName());
            if (result == AppOpsManagerCompat.MODE_ALLOWED)
                return true;
        }
        return false;
    }

    /**
     * 打开应用具体设置
     * 直接跳转到的系统的权限设置页面
     */
    public static void openAppSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + mContext.getPackageName()));
        mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }


}
