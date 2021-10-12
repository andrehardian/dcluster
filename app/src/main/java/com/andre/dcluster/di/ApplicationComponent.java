package com.andre.dcluster.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface ApplicationComponent {
    LoginComponent.Factory loginComponent();
}
