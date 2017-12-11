package com.example.bwie.com.songdechuan20171112;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by SDC on 2017/12/11.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}