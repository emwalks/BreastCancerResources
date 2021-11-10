package com.example;

import android.app.Application;
import android.content.Context;

public class BreastCancerResourcesApplication extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        BreastCancerResourcesApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return BreastCancerResourcesApplication.context;
    }
}
