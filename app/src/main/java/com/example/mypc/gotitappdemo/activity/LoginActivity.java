package com.example.mypc.gotitappdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mypc.gotitappdemo.app.MyApplication;
import com.example.mypc.gotitappdemo.R;
import com.example.mypc.gotitappdemo.model.APIError;
import com.example.mypc.gotitappdemo.model.Account;
import com.example.mypc.gotitappdemo.retrofit.APIRequest;
import com.example.mypc.gotitappdemo.retrofit.ApiClient;
import com.example.mypc.gotitappdemo.retrofit.RestCallBack;
import com.example.mypc.gotitappdemo.util.ErrorUtils;
import com.example.mypc.gotitappdemo.util.PrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by MyPC on 06/09/2016.
 */
public class LoginActivity extends AppCompatActivity {
    EditText tv_email, tv_pass;
    PrefManager prefManager;
    Toolbar toolbar;
    Button btLogin;
    public static String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_email = (EditText) findViewById(R.id.et_email);
        tv_pass = (EditText) findViewById(R.id.et_pass);
        btLogin = (Button) findViewById(R.id.btn_login);
        prefManager = new PrefManager(this);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.item);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = tv_email.getText().toString();
                String pass = tv_pass.getText().toString();

                loginProgess(email, pass);
            }
        });
    }

    public void goHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void loginProgess(String email, String pass) {
        APIRequest apiService =
                ApiClient.getClient(LoginActivity.this).create(APIRequest.class);

        Call<Account> call = apiService.login(email, pass);
        call.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {

                if (response.isSuccessful()) {
                } else {
                    APIError error = ErrorUtils.parseError(response, MyApplication.getInstance());
                    Log.d("error message", error.message());
                }

                Account c = response.body();
                if (c == null) {
                    Toast.makeText(LoginActivity.this, "Loser login", Toast.LENGTH_SHORT).show();
                } else {
                    prefManager.setAccount(c);
                    goHome();
                }
            }
            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                Log.e(TAG, "not ");
                Toast.makeText(LoginActivity.this, "Loser login", Toast.LENGTH_SHORT).show();
            }
        });
        call.enqueue(new RestCallBack<Account>() {
            @Override
            public void failure(APIError restError) {
                Log.e("ok", "loi" + restError.message());
            }
            @Override
            public void onResponse(Call<Account> call, Response<Account> response) {
                super.onResponse(call, response);
            }

            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                super.onFailure(call, t);
            }
        });
    }
}
