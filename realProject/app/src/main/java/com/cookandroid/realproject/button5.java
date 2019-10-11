package com.cookandroid.realproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

public class button5 extends AppCompatActivity {
    TextView tv;
    DatePicker date;
    Calendar c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);
        setTitle("동탄알리미 > 투어 예약 확인");
        tv = (TextView) findViewById(R.id.tv);

        try{
            FileInputStream fis = openFileInput("data.txt");
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            String readedtext = new String(buffer);
            tv.setText(readedtext);
        } catch(IOException e){
            Log.e("파일 읽어오기 실패:", e.getMessage());
        }
    }
}
