package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  //  TextView tv1,tv2,tv3,tv4;
    EditText ev1,ev2,ev3;
    CheckBox mala,hin,eng;
    RadioGroup rg1;
    RadioButton rb1;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // tv1=findViewById(R.id.tv1);
       // tv2=findViewById(R.id.tv2);
       // tv3=findViewById(R.id.tv3);
      //  tv4=findViewById(R.id.tv4);
        ev1=findViewById(R.id.ev1);
        ev2=findViewById(R.id.ev2);
        ev3=findViewById(R.id.ev3);
        mala=findViewById(R.id.mala);
        hin=findViewById(R.id.hin);
        eng=findViewById(R.id.eng);
        rg1=findViewById(R.id.rg1);
        btn1=findViewById(R.id.btn1);



        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String name = ev1.getText().toString();
                                        String email = ev2.getText().toString();
                                        String phn = ev3.getText().toString();
                                        //String gen = tv4.getText().toString();
                                        int radioId = rg1.getCheckedRadioButtonId();
                                        rb1 = findViewById(radioId);

                                        if (name.isEmpty()){
                                            Toast.makeText(MainActivity.this, "Enter the valid name", Toast.LENGTH_SHORT).show();
                                        }
                                        else if (email.isEmpty()){
                                            Toast.makeText(MainActivity.this, "Enter email", Toast.LENGTH_SHORT).show();
                                        }
                                        else if (phn.isEmpty()){
                                            Toast.makeText(MainActivity.this, "Enter phn no.", Toast.LENGTH_SHORT).show();
                                        }
                                        else if(phn.isEmpty()){
                                            Toast.makeText(MainActivity.this, "Enter the phone no.", Toast.LENGTH_SHORT).show();
                                        }
                                        else if (phn.length()<10){
                                            Toast.makeText(MainActivity.this, "Enter the valid phn no.", Toast.LENGTH_SHORT).show();
                                        }
                                        else if(radioId==-1){
                                            Toast.makeText(MainActivity.this, "Select the gender", Toast.LENGTH_SHORT).show();
                                        }
                                        else if(!mala.isChecked() && !hin.isChecked() && !eng.isChecked()){
                                            Toast.makeText(MainActivity.this, "Select any language", Toast.LENGTH_SHORT).show();
                                        }
                                        else
                                        {
                                            Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                                        }



                                    }
        });
    }
    }








