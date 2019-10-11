package com.cookandroid.realproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class button3 extends AppCompatActivity {
    Button food1, food2, food3, food4, food5, food6, food7, food8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);
        setTitle("동탄알리미 > 동탄 맛집");
        food1 = (Button) findViewById(R.id.food1);
        food2 = (Button) findViewById(R.id.food2);
        food3 = (Button) findViewById(R.id.food3);
        food4 = (Button) findViewById(R.id.food4);
        food5 = (Button) findViewById(R.id.food5);
        food6 = (Button) findViewById(R.id.food6);
        food7 = (Button) findViewById(R.id.food7);
        food8 = (Button) findViewById(R.id.food8);

        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food1_1.class);
                startActivity(intent);
            }
        });
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food2_1.class);
                startActivity(intent);
            }
        });
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food3_1.class);
                startActivity(intent);
            }
        });
        food4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food4_1.class);
                startActivity(intent);
            }
        });
        food5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food5_1.class);
                startActivity(intent);
            }
        });
        food6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food6_1.class);
                startActivity(intent);
            }
        });
        food7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food7_1.class);
                startActivity(intent);
            }
        });food8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), food8_1.class);
                startActivity(intent);
            }
        });

    }
}
