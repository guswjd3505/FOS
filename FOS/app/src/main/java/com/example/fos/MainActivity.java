package com.example.fos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View v){
        Intent intent = new Intent(MainActivity.this, HamActivity.class);
        startActivity(intent);
    }
    public void onClick2(View v){
        Intent intent = new Intent(MainActivity.this, ARimActivity.class);
        startActivity(intent);
    }
    public void onClick3(View v){
        Intent intent = new Intent(MainActivity.this, KBActivity.class);
        startActivity(intent);
    }
}
