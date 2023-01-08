package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView highview,txtview;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,mul,div,add,sub,btneq,btndot,C;
    float f1,f2,res;
    int ch;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        highview=findViewById(R.id.highview);
        txtview=findViewById(R.id.txtview);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btneq=findViewById(R.id.btneq);
        btndot=findViewById(R.id.btndot);
        C=findViewById(R.id.C);
        mul=findViewById(R.id.mul);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        add=findViewById(R.id.add);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "3");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "0");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "4");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "0");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+ ".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText("");
                highview.setText(f1 +"+");
                ch=1;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText("");
                highview.setText(f1 +"*");
                ch=2;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText("");
                highview.setText(f1 +"-");
                ch=3;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText("");
                highview.setText(f1 +"/");
                ch=4;
            }
        });

        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(ch) {
                    case 1:
                        f2 = Float.parseFloat(txtview.getText().toString());
                        res = f1 + f2;
                        txtview.setText(String.valueOf(res));
                        highview.setText(f1 + "+" + f2 + "=");
                        break;
                    case 2:
                        f2 = Float.parseFloat(txtview.getText().toString());
                        res = f1 * f2;
                        txtview.setText(String.valueOf(res));
                        highview.setText(f1 + "*" + f2 + "=");
                        break;
                    case 3:
                        f2 = Float.parseFloat(txtview.getText().toString());
                        res = f1 - f2;
                        txtview.setText(String.valueOf(res));
                        highview.setText(f1 + "-" + f2 + "=");
                        break;
                    case 4:
                        f2 = Float.parseFloat(txtview.getText().toString());
                        res = f1 / f2;
                        txtview.setText(String.valueOf(res));
                        highview.setText(f1 + "/" + f2 + "=");
                        break;
                }
                }




        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(" ");
                highview.setText(" ");
            }
        });











    }
}