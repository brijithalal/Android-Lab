package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView bal;
    Button deposit,withdrawl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bal=findViewById(R.id.bal);
        deposit=findViewById(R.id.deposit);
        withdrawl=findViewById(R.id.withdrawl);

        String data=String.valueOf(amount.amt);
        bal.setText(data);

        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,deposit.class);
                startActivity(i);
            }
        });
        withdrawl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,withdrawl.class);
                startActivity(i);
            }
        });




    }
}