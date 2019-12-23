package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AMenuActivity extends AppCompatActivity {

    int[] temp = {0};

    Button btn;

    TextView jja, jjam, bok, menuset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenu);



        jja = (TextView) findViewById(R.id.jja);
        jjam = (TextView) findViewById(R.id.jjam);
        bok = (TextView) findViewById(R.id.bok);

    }

    public void onClick1(View v) {
        if (temp[0] == 0) {
            v.setBackgroundColor(Color.RED);
            temp[0] = 1;
        } else {
            v.setBackgroundColor(Color.WHITE);
            temp[0] = 0;
        }
    }

    public void onClick2(View v) {
        if (temp[0] == 0) {
            v.setBackgroundColor(Color.RED);
            temp[0] = 1;
        } else {
            v.setBackgroundColor(Color.WHITE);
            temp[0] = 0;
        }


    }

    public void onClick3(View v) {
        if (temp[0] == 0) {
            v.setBackgroundColor(Color.RED);
            temp[0] = 1;
        } else {
            v.setBackgroundColor(Color.WHITE);
            temp[0] = 0;
        }

    }




}