package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email;
    Button save,nxtpage;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        save=findViewById(R.id.save);
        nxtpage=findViewById(R.id.nxtpage);

        sp=getSharedPreferences("Profile", Context.MODE_PRIVATE);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=name.getText().toString();
                String umail=email.getText().toString();

                SharedPreferences.Editor ed=sp.edit();
                ed.putString("name",uname);
                ed.putString("email",umail);
                ed.commit();
                Toast.makeText(MainActivity.this, "Details Saved Locally", Toast.LENGTH_SHORT).show();

            }
        });
        nxtpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });


    }
}