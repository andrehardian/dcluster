package com.andre.dcluster.di;

import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Singleton
    @Provides
    public FirebaseAuth provideAuth(){
        return FirebaseAuth.getInstance();
    }
}
