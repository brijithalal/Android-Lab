package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page1 extends AppCompatActivity {
Button home;
TextView pagetxt1,pagetxt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        home=findViewById(R.id.home);
        pagetxt1=findViewById(R.id.pagetxt1);
        pagetxt2=findViewById(R.id.pagetxt2);

        Intent i=getIntent();
        String num1,num2;
        num1=i.getStringExtra("fnum");
        num2=i.getStringExtra("snum");
        pagetxt1.setText("First number" +num1);
        pagetxt2.setText("Second number" +num2);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(page1.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }
}