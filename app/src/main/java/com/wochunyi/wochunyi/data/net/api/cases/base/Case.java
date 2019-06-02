package com.wochunyi.wochunyi.data.net.api.cases.base;

import com.wochunyi.wochunyi.data.net.thread.PostExecutionThread;
import com.wochunyi.wochunyi.data.net.thread.ThreadExecutor;

import org.reactivestreams.Subscriber;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public abstract class Case {

    private final ThreadExecutor threadExecutor;
    private final PostExecutionThread postExecutionThread;

    private Disposable disposable = Disposables.empty();

    protected Case(ThreadExecutor threadExecutor,
                   PostExecutionThread postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    protected abstract Observable buildCaseObservable();

//    public void execute(Subscriber subscriber) {
//        this.disposable = this.buildCaseObservable()
//                .subscribeOn(Schedulers.from(threadExecutor))
//                .observeOn(postExecutionThread.getScheduler())
//                .subscribe((Consumer) subscriber);
//    }

    public void execute(Consumer consumer) {
        this.disposable = this.buildCaseObservable()
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getScheduler())
                .subscribe(consumer);
    }

    public void unsubscribe() {
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}
