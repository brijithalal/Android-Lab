package com.example.spinnerimage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    ImageView imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin=findViewById(R.id.spin);
        imageView=findViewById(R.id.imageView);

        String img[]=new String[] {"pic1","pic2","pic3"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,img);
        arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);

    spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            String data=spin.getItemAtPosition(i).toString();
            if (img[0].equals(data)){
                imageView.setImageResource(R.drawable.pic1);
            }
           else if (img[1].equals(data)){
                imageView.setImageResource(R.drawable.pic2);
            }
           else if (img[2].equals(data)){
                imageView.setImageResource(R.drawable.pic3);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });


    }

}