package com.wochunyi.wochunyi.data.net.api.presenter;

import android.content.Context;

import com.wochunyi.wochunyi.data.entity.bean.Result;
import com.wochunyi.wochunyi.data.entity.bean.SuserLogin;
import com.wochunyi.wochunyi.data.net.api.cases.SuserLoginCase;
import com.wochunyi.wochunyi.data.net.api.cases.base.Case;
import com.wochunyi.wochunyi.data.net.api.cases.base.DefaultConsumer;
import com.wochunyi.wochunyi.data.net.api.view.SuserLoginView;
import com.wochunyi.wochunyi.data.net.exception.CommonErrorHelper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class SuserLoginPresenter {
    public final static String TAG = SuserLoginPresenter.class.getSimpleName();
    private Case mCase;
    private Context mContext;
    private SuserLoginView loadingView;
    @Inject
    public SuserLoginPresenter(Context mContext, @Named("suserLogin") Case suserLoginCase){
        this.mContext = mContext;
        this.mCase = suserLoginCase;
    }

    public void setView(SuserLoginView suserLoginView){
        this.loadingView = suserLoginView;
    }

    public void  suserLogin(String phone,String password,String clientid){
        ((SuserLoginCase)mCase).setData(phone,password,clientid);
        mCase.execute(new SuserLoginConsumer(mContext));
        loadingView.showLoading();
    }

    private final class SuserLoginConsumer extends DefaultConsumer<Result<SuserLogin>> {

        protected SuserLoginConsumer(Context mContext) {
            super(mContext);
        }
       @Override
        public void accept(Result<SuserLogin> result){
            try {
                super.accept(result);
                loadingView.lodingSuserLoginView(true,result.getData().toString(),result.getMsg());
            } catch (Exception e) {
                e.printStackTrace();
                CommonErrorHelper.handleCommonError(mContext,e);
            }
        }
    }
}
