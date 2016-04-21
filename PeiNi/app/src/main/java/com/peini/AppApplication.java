package com.peini;

import android.app.Application;

import com.peini.util.CommonValue;

/**
 * Created by fuhao on 16/4/11.
 */
public class AppApplication extends Application {
    public static AppApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;
        CommonValue.init();
    }
}
