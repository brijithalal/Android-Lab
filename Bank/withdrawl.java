package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class withdrawl extends AppCompatActivity {
    TextView wit_bal;
    EditText wit_amt;
    Button wit_con;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawl);
        wit_bal=findViewById(R.id.wit_bal);
        wit_amt=findViewById(R.id.wit_amt);
        wit_con=findViewById(R.id.wit_con);

        String data=String.valueOf(amount.amt);
        wit_bal.setText(data);
        wit_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1;
                f1=Float.parseFloat(wit_amt.getText().toString());
                amount.amt=amount.amt-f1;
                Toast.makeText(withdrawl.this, "Withdrawl Successfull", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(withdrawl.this,Home.class);
                startActivity(i);

            }
        });


    }
}