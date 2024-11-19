package com.chari6268.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chari6268.mylibrary.sampleShow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(sampleShow.getHelloWorld());
    }
}