package com.example.menua;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {
    EditText rad;
    Button Circalc;
    TextView resulttxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        rad=findViewById(R.id.rad);
        Circalc=findViewById(R.id.CirCalc);
        resulttxt=findViewById(R.id.resulttxt);

        Circalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float r,res;
                float pi= (float) 3.14;
                r=Float.parseFloat(rad.getText().toString());
                res=pi * r * r;
                String data=String.valueOf(res);
                resulttxt.setText(data);
            }
        });
    }
}