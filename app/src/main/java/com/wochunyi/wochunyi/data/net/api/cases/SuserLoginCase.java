package com.wochunyi.wochunyi.data.net.api.cases;

import com.wochunyi.wochunyi.data.net.api.cases.base.Case;
import com.wochunyi.wochunyi.data.net.api.repository.ApiRepository;
import com.wochunyi.wochunyi.data.net.thread.PostExecutionThread;
import com.wochunyi.wochunyi.data.net.thread.ThreadExecutor;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class SuserLoginCase extends Case {
    private ApiRepository repository;
    private String phone;
    private String password;
    private String clientid;

    @Inject
    public SuserLoginCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread,
                      ApiRepository repository) {
        super(threadExecutor, postExecutionThread);
        this.repository = repository;
    }

    public void setData(String phone,String password,String clientid){
        this.phone = phone;
        this.password=password;
        this.clientid=clientid;
    }

    @Override
    protected Observable buildCaseObservable() {
        return repository.suserLogin(phone,password,clientid);
    }
}
