package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String clickItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        String fruits[]=new String[] {"Apple","Orange","Grapes","Banana"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.item,R.id.text1,fruits);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                clickItem=fruits[i];
                Toast.makeText(MainActivity.this, clickItem, Toast.LENGTH_SHORT).show();

                Intent I=new Intent(MainActivity.this,page2.class);
                I.putExtra("title",clickItem);
                startActivity(I);
            }
        });


    }
}