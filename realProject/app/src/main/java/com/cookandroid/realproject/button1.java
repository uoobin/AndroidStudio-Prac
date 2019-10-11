package com.cookandroid.realproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class button1 extends AppCompatActivity {
    Button hscity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);
        setTitle("동탄알리미 > 동탄 소개");
        Intent intent = getIntent();

        hscity = (Button) findViewById(R.id.hscity);

        hscity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hscity.go.kr/www/index.do"));
                startActivity(intent);
            }
        });
    }


}
