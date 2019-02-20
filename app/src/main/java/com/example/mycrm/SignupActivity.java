package com.example.mycrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void sign_up_button(View view)
    {
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void btn_reset_password(View view)
    {
        Intent intent = new Intent(SignupActivity.this, ForgetPassword.class);
        startActivity(intent);
    }

}
