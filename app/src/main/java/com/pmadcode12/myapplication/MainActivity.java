package com.pmadcode12.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    LayoutInflater li=getLayoutInflater();
    View v= li.inflate(R.layout.sub_layout,null);

    //FrameLayout f1= findViewById(R.id.My_fralay);
    //f1.addView(v);

    LinearLayout lely=findViewById(R.id.my_linLay);
    lely.addView(v);
}
}