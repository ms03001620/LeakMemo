package com.goufang.leakmemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Administrator on 2015/9/28.
 */
public class MainApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
