package com.example.mypc.gotitappdemo.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.mypc.gotitappdemo.model.Account;
import com.google.gson.GsonBuilder;

/**
 * Created by MyPC on 06/09/2016.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;
    private static final String PREF_NAME = "GOTIT";
    private static final String AUTH = "AUTH";
    int PRIVATE_MODE = 0;

    public PrefManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
        GsonBuilder builder = new GsonBuilder();
    }

    public void setAccount(Account account) {
        editor.putString(AUTH, account.getAuth());
        editor.commit();
    }

    public void logout() {
        editor.putString(AUTH, "no");
        editor.commit();
    }
    public Account getAccount() {
        String auth = pref.getString(AUTH, "no");
        Account account = new Account(auth);
        return account;
    }
}
