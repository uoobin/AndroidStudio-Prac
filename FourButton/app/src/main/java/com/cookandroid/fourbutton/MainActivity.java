package com.cookandroid.fourbutton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri
                    .parse("https://m.nate.com"));
                startActivity(mlntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri
                    .parse("tel:/911"));
                startActivity(mlntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri
                    .parse("content://media/internal/images/media"));
                startActivity(mlntent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
