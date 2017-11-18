package com.tkb.boilerplate.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by tarun on 11/18/17.
 */

public class BoilerApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}