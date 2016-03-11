package xyz.dokup.appalivemonitor.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by e10dokup on 2016/03/11
 **/
public class MyApplication extends Application implements Application.ActivityLifecycleCallbacks{
    private static final String TAG = MyApplication.class.getSimpleName();
    private final MyApplication self = this;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.d(TAG, "onCreated:" + activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.d(TAG, "onStarted:" + activity);
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.d(TAG, "onResumed:" + activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.d(TAG, "onPaused:" + activity);
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.d(TAG, "onStopped:" + activity);
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Log.d(TAG, "onSavedInstanceState:" + activity);
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.d(TAG, "onDestroyed:" + activity);
    }
}