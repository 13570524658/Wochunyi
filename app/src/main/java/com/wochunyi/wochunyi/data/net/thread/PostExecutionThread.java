package com.wochunyi.wochunyi.data.net.thread;

import io.reactivex.Scheduler;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}