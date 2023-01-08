package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String strEmail,strPassword;
    EditText email,password;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        loginbtn = findViewById(R.id.btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String strEmail=email.getText().toString();
                String strPassword=password.getText().toString();


                if(strEmail.equals("admin@gmail.com") && strPassword.equals("admin123") )
                {
                 //   startActivity(new Intent(MainActivity.this,Homepage.class));

                    Intent i=new Intent(MainActivity.this,Homepage.class);
                    i.putExtra("email",strEmail);
                    startActivity(i);


                    Toast.makeText(MainActivity.this, "Login Success",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}