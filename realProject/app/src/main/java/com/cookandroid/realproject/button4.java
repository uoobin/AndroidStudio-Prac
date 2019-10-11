package com.cookandroid.realproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class button4 extends AppCompatActivity {
    Button buttonOK;
    EditText name, phone, people;
    DatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);
        setTitle("동탄알리미 > 동탄 투어 예약");
        Intent intent = getIntent();

        buttonOK = (Button) findViewById(R.id.buttonOK);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        people = (EditText) findViewById(R.id.people);
        date = (DatePicker) findViewById(R.id.date);

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = name.getText().toString();
                name.setText("");
                String str2 = phone.getText().toString();
                phone.setText("");
                String str3 = people.getText().toString();
                people.setText("");
                Integer int1 = date.getYear();
                Integer int2 = date.getMonth();
                Integer int3 = date.getDayOfMonth();

                try{
                    FileOutputStream fos = openFileOutput("data.txt", Context.MODE_APPEND);
                    PrintWriter writer = new PrintWriter(fos);
                    writer.println("에약자 이름 : " + str1);
                    writer.println("연락처 : " + str2);
                    writer.println("예약 인원 : " + str3);
                    writer.println("예약일 : "+int1+"/"+(int2+1)+"/"+int3);
                    writer.println("-----------------------------------------");
                    writer.close();
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }

                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                Toast toast = Toast.makeText(button4.this, "예약되었습니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });
    }
}
