package com.example.mypc.gotitappdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.mypc.gotitappdemo.R;
import com.example.mypc.gotitappdemo.util.PrefManager;

/**
 * Created by MyPC on 06/09/2016.
 */
public class SplashActivity extends AppCompatActivity {

    TextView tvLogin;
    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvLogin = (TextView) findViewById(R.id.tv_login);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProgess();
            }
        });

        prefManager = new PrefManager(this);

        if (!prefManager.getAccount().getAuth().equalsIgnoreCase("no")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

    }

    public void loginProgess() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);


    }
}
