package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText getTextCnfPassword;
    Button mButtonSignUp;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mTextUsername=findViewById(R.id.edt_username);
        mTextPassword=findViewById(R.id.edt_password);
        getTextCnfPassword=findViewById(R.id.edt_cnf_password);
        mButtonSignUp=findViewById(R.id.btn_signup);
        mTextViewLogin=findViewById(R.id.txt_login);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}