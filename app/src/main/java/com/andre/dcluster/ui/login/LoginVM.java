package com.andre.dcluster.ui.login;

import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

import com.andre.dcluster.repository.LoginRepository;

import javax.inject.Inject;

public class LoginVM extends ViewModel {
    private LoginRepository repo;
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    @Inject
    public LoginVM(LoginRepository loginRepository) {
        repo = loginRepository;
    }


    public void createUser() {
        Log.d("crot",username.get());
        Log.d("crot",password.get());
//        repo.login(username.get(), password.get());
    }
}
