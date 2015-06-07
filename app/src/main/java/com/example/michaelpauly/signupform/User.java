package com.example.michaelpauly.signupform;

import java.io.Serializable;

/**
 * Created by Michael Pauly on 6/7/2015.
 */
public class User implements Serializable {
    private String mUsername;
    private String mPassword;

    User(String username, String password){
        mUsername = username;
        mPassword = password;
    }

    public String getmUsername() {
        return mUsername;
    }
}
