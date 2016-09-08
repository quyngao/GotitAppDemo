package com.example.mypc.gotitappdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyPC on 06/09/2016.
 */
public class Account {
    @SerializedName("auth")
    private String auth;


    public Account(String auth) {
        this.auth = auth;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
