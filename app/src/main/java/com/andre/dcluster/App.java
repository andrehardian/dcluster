package com.andre.dcluster;

import android.app.Application;
import android.content.Context;

import com.andre.dcluster.di.ApplicationComponent;
import com.andre.dcluster.di.DaggerApplicationComponent;

import lombok.Getter;

public class App extends Application {
    @Getter
    private ApplicationComponent applicationComponent;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        applicationComponent = DaggerApplicationComponent.create();
    }
}
