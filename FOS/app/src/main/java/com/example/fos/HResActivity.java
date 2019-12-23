package com.example.fos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class HResActivity extends AppCompatActivity {

    int[] temp1={0};
    int[] temp2={0};
    int[] temp3={0};
    int[] temp4={0};
    int[] temp5={0};
    int[] temp6={0};
    int[] temp7={0};
    int[] temp8={0};


    Button button2,button3,button4,button5,button6,button7,button8,button9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hres);

        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8 =(Button) findViewById(R.id.button8);
        button9 =(Button) findViewById(R.id.button9);

    }

    public void onClick1(View v){
        if(temp1[0]==0){
            button2.setBackgroundColor(Color.RED);
            temp1[0]=1;
        } else{
            button2.setBackgroundColor(Color.LTGRAY);
            temp1[0]=0;
        }
    }

    public void onClick2(View v){
        if(temp2[0]==0){
            button3.setBackgroundColor(Color.RED);
            temp2[0]=1;
        } else{
            button3.setBackgroundColor(Color.LTGRAY);
            temp2[0]=0;
        }
    }
    public void onClick3(View v){
        if(temp3[0]==0){
            button4.setBackgroundColor(Color.RED);
            temp3[0]=1;
        } else{
            button4.setBackgroundColor(Color.LTGRAY);
            temp3[0]=0;
        }
    }

    public void onClick4(View v){
        if(temp4[0]==0){
            button5.setBackgroundColor(Color.RED);
            temp4[0]=1;
        } else{
            button5.setBackgroundColor(Color.LTGRAY);
            temp4[0]=0;
        }
    }

    public void onClick5(View v){
        if(temp5[0]==0){
            button6.setBackgroundColor(Color.RED);
            temp5[0]=1;
        } else{
            button6.setBackgroundColor(Color.LTGRAY);
            temp5[0]=0;
        }
    }
    public void onClick6(View v){
        if(temp6[0]==0){
            button7.setBackgroundColor(Color.RED);
            temp6[0]=1;
        } else{
            button7.setBackgroundColor(Color.LTGRAY);
            temp6[0]=0;
        }
    }
    public void onClick7(View v){
        if(temp7[0]==0){
            button8.setBackgroundColor(Color.RED);
            temp7[0]=1;
        } else{
            button8.setBackgroundColor(Color.LTGRAY);
            temp7[0]=0;
        }
    }
    public void onClick8(View v){
        if(temp8[0]==0){
            button9.setBackgroundColor(Color.RED);
            temp8[0]=1;
        } else{
            button9.setBackgroundColor(Color.LTGRAY);
            temp8[0]=0;
        }
    }

    public void onClick11(View v){
        createNotification();
    }

    private void createNotification () {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "default");

        builder.setSmallIcon(R.drawable.dish);
        builder.setContentTitle("FOS");
        builder.setContentText("예약이 완료되었습니다");

        builder.setColor(Color.RED);
        // 사용자가 탭을 클릭하면 자동 제거
        builder.setAutoCancel(true);

        // 알림 표시
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationManager.createNotificationChannel(new NotificationChannel("default", "기본 채널", NotificationManager.IMPORTANCE_DEFAULT));
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        }

        // id값은
        // 정의해야하는 각 알림의 고유한 int값
        notificationManager.notify(1, builder.build());
    }
}
