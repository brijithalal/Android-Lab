package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deposit extends AppCompatActivity {
    TextView dep_bal;
    EditText dep_amt;
    Button dep_con;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        dep_bal=findViewById(R.id.dep_bal);
        dep_amt=findViewById(R.id.dep_amt);
        dep_con=findViewById(R.id.dep_con);

        String data=String.valueOf(amount.amt);
        dep_bal.setText(data);

        dep_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1;
                f1=Float.parseFloat(dep_amt.getText().toString());
                amount.amt=amount.amt+f1;
                Toast.makeText(deposit.this, "Deposited Successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(deposit.this,Home.class);
                startActivity(i);
            }
        });

    }
}