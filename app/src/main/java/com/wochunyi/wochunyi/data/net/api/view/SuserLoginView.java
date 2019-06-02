package com.wochunyi.wochunyi.data.net.api.view;

import com.wochunyi.wochunyi.data.net.api.view.base.LoadingView;

/**
 * @author wochunyi
 * @date 2019-06-01.
 * GitHub：https://github.com/13570524658
 */
public interface SuserLoginView extends LoadingView {
    void lodingSuserLoginView(boolean isSuccess, String result, String msg);
}
