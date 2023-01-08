package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText palin;
    Button palinbtn;
    TextView txtres;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palin=findViewById(R.id.palin);
        palinbtn=findViewById(R.id.palinbtn);
        txtres=findViewById(R.id.txtres);

        palinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] charinput=palin.getText().toString().toCharArray();
                int inputlength=charinput.length;

                boolean isPalindrome=true;

                for(int i=0;i<inputlength/2;i++){
                    if(charinput[i]!=charinput[inputlength-1-i]){
                        isPalindrome=false;
                        break;
                    }

                }
                if(isPalindrome){
                    txtres.setText("Palindrome");
                }
                else
                {
                    txtres.setText("Not Palindrome");
                }

            }

        });
    }
}