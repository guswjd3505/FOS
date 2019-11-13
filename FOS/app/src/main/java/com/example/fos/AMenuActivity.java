package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AMenuActivity extends AppCompatActivity {

    int[] temp={0};

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenu);

        btn =(Button) findViewById(R.id.button);

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
