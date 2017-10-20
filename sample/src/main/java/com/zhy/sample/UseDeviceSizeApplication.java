package com.zhy.sample;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConfig;

/**
 * Created by zhy on 15/12/23.
 */
public class UseDeviceSizeApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        AutoLayoutConfig.getInstance().useDeviceSize().init(this);
    }
}
