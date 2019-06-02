package com.wochunyi.wochunyi.data.net.api.cases.base;

import android.content.Context;

import com.wochunyi.wochunyi.data.net.exception.CommonErrorHelper;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.functions.Consumer;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public class DefaultConsumer<T> implements Consumer<T> {

    private Context mContext;

    protected DefaultConsumer(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public void accept(T t) throws Exception {

    }



}
