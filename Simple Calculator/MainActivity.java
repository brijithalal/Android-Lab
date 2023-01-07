package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView txt1;
    Button btnadd,btnsub,btnmul,btndiv,btnhome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        txt1=findViewById(R.id.txt1);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnhome=findViewById(R.id.btnhome);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,r;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                r=f+s;
                txt1.setText(String.valueOf(r));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,r;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                r=f-s;
                txt1.setText(String.valueOf(r));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,r;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                r=f*s;
                txt1.setText(String.valueOf(r));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f,s,r;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                r=f/s;
                txt1.setText(String.valueOf(r));
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,page1.class);
                String f,s;
                f=et1.getText().toString();
                s=et2.getText().toString();
                i.putExtra("fnum",f);
                i.putExtra("snum",s);
                startActivity(i);

            }
        });

    }
}