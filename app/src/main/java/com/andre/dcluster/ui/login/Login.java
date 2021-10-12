package com.andre.dcluster.ui.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.andre.dcluster.App;
import com.andre.dcluster.R;
import com.andre.dcluster.databinding.ActivityLoginBinding;

import javax.inject.Inject;

public class Login extends AppCompatActivity {

    @Inject
    LoginVM loginVM;

    private int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplicationContext()).getApplicationComponent()
                .loginComponent().create().injectLogin(this);
        ActivityLoginBinding dataBinding = DataBindingUtil
                .setContentView(this, layoutId());
        dataBinding.setViewModel(loginVM);
    }

}