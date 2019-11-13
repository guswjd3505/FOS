package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kb);
    }

    public void onClick1(View v){
        Intent intent = new Intent(KBActivity.this, KBMenuActivity.class);
        startActivity(intent);
    }
    public void onClick2(View v){
        Intent intent = new Intent(KBActivity.this, KBResActivity.class);
        startActivity(intent);
    }
}
