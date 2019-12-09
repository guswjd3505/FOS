package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AMenuActivity extends AppCompatActivity {

    int[] temp={0};

    Button btn;

    TextView jja,jjam,bok,menuset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenu);

        btn =(Button) findViewById(R.id.button);

        jja = (TextView)findViewById(R.id.jja);
        jjam=(TextView)findViewById(R.id.jjam);
        bok =(TextView)findViewById(R.id.bok);
        menuset=(TextView)findViewById(R.id.menuset);

    }
    public void onClick1(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }

        Intent intent1 = new Intent(AMenuActivity.this,MyPageActivity.class);
        intent1.putExtra("jja",jja.getText().toString());
    }
    public void onClick2(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }

        Intent intent2 = new Intent(AMenuActivity.this,MyPageActivity.class);
        intent2.putExtra("jjam",jjam.getText().toString());
    }
    public void onClick3(View v){
        if(temp[0]==0){
            v.setBackgroundColor(Color.RED);
            temp[0]=1;
        } else{
            v.setBackgroundColor(Color.WHITE);
            temp[0]=0;
        }

        Intent intent3 = new Intent(AMenuActivity.this,MyPageActivity.class);
        intent3.putExtra("bok",bok.getText().toString());
    }

    @Override
    protected  void onPause(){
        super.onPause();
        saveState();
    }

    @Override
    protected void onResume(){
        super.onResume();
        restoreSatate();
    }

    protected void saveState(){
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("jja",jja.getText().toString());
        editor.putString("jjam",jjam.getText().toString());
        editor.putString("bok",bok.getText().toString());
        editor.commit();
    }

    protected void restoreSatate(){
        SharedPreferences pref = getSharedPreferences("pref",Activity.MODE_PRIVATE);
        if((pref!=null)&&(pref.contains("jja"))&&(pref.contains(("jjam")))&&(pref.contains("bok"))){
            String jja1 = pref.getString("jja","");
            String jjam1 = pref.getString("jjam","");
            String bok1 = pref.getString("bok","");

            jja.setText(jja1);
            jjam.setText(jjam1);
            bok.setText(bok1);

        }
    }
}
