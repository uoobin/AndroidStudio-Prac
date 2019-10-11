package com.cookandroid.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("토스트 연습");

        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(MainActivity.this, "토스트 연습", Toast.LENGTH_SHORT);

                DisplayMetrics display = getApplicationContext().getResources().getDisplayMetrics();
                int xOffset = (int) (Math.random() * display.widthPixels);
                int yOffset = (int) (Math.random() * display.heightPixels);

                tMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
                tMsg.show();
            }
        });
    }
}
