package com.andre.dcluster.di;


import com.andre.dcluster.ui.login.Login;

import dagger.Subcomponent;

@LoginScope
@Subcomponent
public interface LoginComponent {
    @Subcomponent.Factory
    interface Factory{
        LoginComponent create();
    }
    void injectLogin(Login activity);
}
