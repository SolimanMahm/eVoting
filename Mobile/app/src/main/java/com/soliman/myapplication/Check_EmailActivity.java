package com.soliman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Check_EmailActivity extends AppCompatActivity {

    ImageButton Close;
    Button GoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_email);

        Close = findViewById(R.id.imageButton);
        GoEmail = findViewById(R.id.button1);

        GoEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Check_EmailActivity.this, ResetPassword.class));
                finish();
            }
        });

        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}