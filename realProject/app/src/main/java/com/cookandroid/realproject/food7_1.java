package com.cookandroid.realproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food7_1 extends AppCompatActivity {
    Button other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food7_1);
        setTitle("동탄알리미 > 동탄 맛집 > 호무라텐동");
        other = (Button) findViewById(R.id.other);

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
