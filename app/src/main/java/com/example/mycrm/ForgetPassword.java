package com.example.mycrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }

    public void btn_back(View view)
    {
        Intent intent = new Intent(ForgetPassword.this, LoginActivity.class);
        startActivity(intent);
    }

}
