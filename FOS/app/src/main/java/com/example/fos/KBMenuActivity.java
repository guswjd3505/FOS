package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class KBMenuActivity extends AppCompatActivity {

    int[] temp={0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kbmenu);
    }

    public void onClick1(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }
    }

    public void onClick2(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }
    }
    public void onClick3(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }
    }


}
