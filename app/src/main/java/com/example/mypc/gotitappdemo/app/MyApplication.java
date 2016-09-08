package com.example.mypc.gotitappdemo.app;

import android.app.Application;

/**
 * Created by MyPC on 08/08/2016.
 */
public class MyApplication extends Application {
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

    }

    public static MyApplication getInstance() {
        return instance;
    }
}
