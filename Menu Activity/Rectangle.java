package com.example.menua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {
    EditText len,wid;
    Button RectCalc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        len=findViewById(R.id.len);
        wid=findViewById(R.id.wid);
        RectCalc=findViewById(R.id.RectCalc);
        result=findViewById(R.id.result);

        RectCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1,f2,res;
                f1=Integer.parseInt(len.getText().toString());
                f2=Integer.parseInt(wid.getText().toString());
                res=f1*f2;
                String data=String.valueOf(res);
                result.setText(data);
            }
        });

    }
}