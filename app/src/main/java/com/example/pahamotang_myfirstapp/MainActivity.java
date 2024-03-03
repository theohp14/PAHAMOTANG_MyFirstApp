package com.example.pahamotang_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView helloworld;
    Button  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button=findViewById(R.id.button);
        helloworld=findViewById(R.id.helloworld);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 {helloworld.setText("Hi Theo!");
            }
        };
    });
}}

