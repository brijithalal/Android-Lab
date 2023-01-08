package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtname,txtmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtname=findViewById(R.id.txtname);
        txtmail=findViewById(R.id.txtmail);

        SharedPreferences sp=getSharedPreferences("Profile", Context.MODE_PRIVATE);
        String pname=sp.getString("name","");
        String pmail=sp.getString("email","");
        txtname.setText((pname));
        txtmail.setText((pmail));


    }
}