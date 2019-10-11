package com.cookandroid.realproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food1_1 extends AppCompatActivity {
    Button other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1_1);
        setTitle("동탄알리미 > 동탄 맛집 > 황소가한우곱창");
        other = (Button) findViewById(R.id.other);

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
