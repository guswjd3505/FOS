package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MyPageActivity extends AppCompatActivity {

    TextView menuset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        menuset = (TextView)findViewById(R.id.menuset);
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
        editor.putString("menuset",menuset.getText().toString());
        editor.commit();
    }

    protected void restoreSatate(){
        SharedPreferences pref = getSharedPreferences("pref",Activity.MODE_PRIVATE);
        if((pref!=null)&&(pref.contains("menuset"))){
            String menuset1 = pref.getString("menuset","예약한 메뉴 : ");
            menuset.setText(menuset1);

        }
    }
}
