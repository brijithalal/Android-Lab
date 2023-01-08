package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    TextView mail;

   // @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        mail=findViewById(R.id.mail);


        Intent i=getIntent();
        String email=i.getStringExtra("email");
        mail.setText(email);





    }
}