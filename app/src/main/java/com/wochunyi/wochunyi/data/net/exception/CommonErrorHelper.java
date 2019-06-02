package com.wochunyi.wochunyi.data.net.exception;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.wochunyi.wochunyi.data.config.AppConifg;
import com.wochunyi.wochunyi.data.net.api.presenter.SuserLoginPresenter;
import com.wochunyi.wochunyi.main.util.ToastUtil;

import java.io.IOException;
import java.net.SocketTimeoutException;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import retrofit2.HttpException;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class CommonErrorHelper {
    public final static String TAG = CommonErrorHelper.class.getSimpleName();
    public static void handleCommonError(Context context, Throwable e) {
        String type = "";
        if(AppConifg.CONNECT_TYPE == 0){
            type+="正式环境:";
        }else if (AppConifg.CONNECT_TYPE==1){
            type+="开发环境:";
        }else if (AppConifg.CONNECT_TYPE==2){
            type+="测试环境:";
        }
        if(e instanceof SocketTimeoutException) {
            ToastUtil.show(type+"连接超时，请重试!");
            e.printStackTrace();
        } else if(e instanceof IndexOutOfBoundsException){
            ToastUtil.show(type+"返回数据出错，请重试!");
            e.printStackTrace() ;
        }else if (e instanceof HttpException) {
            ToastUtil.show(type+"Request Failed,HttpException!");
            e.printStackTrace() ;
        } else if (e instanceof IOException) {
            ToastUtil.show(type+"Request Failed,IOException!");
            e.printStackTrace() ;
        }else  if (e instanceof OnErrorNotImplementedException){
            ToastUtil.show(type+"找不到主机!");
            e.printStackTrace() ;
        }
        else{
            ToastUtil.show(type+"请求失败，请重试!");
            e.printStackTrace() ;
        }
    }
}
