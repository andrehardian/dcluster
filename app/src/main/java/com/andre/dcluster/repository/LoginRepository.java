package com.andre.dcluster.repository;


import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.gson.Gson;

import javax.inject.Inject;

public class LoginRepository {
    private FirebaseAuth firebaseAuth;
    @Inject
    public LoginRepository(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    public void login(String username, String password) {
        firebaseAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.d("crot",task.isSuccessful()+"");
            }
        });

    }

//    test create user
    public void createUser() {
        firebaseAuth.createUserWithEmailAndPassword("andrehardian@gmail.com", "abangGorengan").addOnCompleteListener(
                new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                        }
                    }
                }
        );
    }
}
