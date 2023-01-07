package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
TextView page2txt;
Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        page2txt=findViewById(R.id.page2txt);
        Intent I=getIntent();
        String data=I.getStringExtra("title");
        page2txt.setText("You selected" +data);
        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(page2.this,MainActivity.class);
                startActivity(n);

            }
        });


    }
}