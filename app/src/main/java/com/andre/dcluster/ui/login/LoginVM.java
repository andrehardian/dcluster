package com.andre.dcluster.ui.login;

import androidx.lifecycle.ViewModel;

import com.andre.dcluster.repository.LoginRepository;

import javax.inject.Inject;

public class LoginVM extends ViewModel {
    private LoginRepository repo;

    @Inject
    public LoginVM(LoginRepository loginRepository) {
        repo = loginRepository;
    }


    public void createUser() {
        repo.createUser();
    }
}
