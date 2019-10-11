package com.cookandroid.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    ViewFlipper v_flipper;
    Button button1_1, button1_2, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo);
        setTitle("GIGABOX");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1_1 = (Button) findViewById(R.id.button1_1);
        button1_2 = (Button) findViewById(R.id.button1_2);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        int images[] = {
                R.drawable.image_v1,
                R.drawable.image_v2,
                R.drawable.image_v3,
                R.drawable.image_v4,
                R.drawable.image_v5,
                R.drawable.image_v6,
                R.drawable.image_v7,
        };

        v_flipper = findViewById(R.id.image_slide);
        for(int image : images){
            flipperImages(image);
        }

        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), button1_1.class);
                startActivity(intent);
            }
        });

        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), button1_2.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), button2.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2500);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.itemYellow:
                baseLayout.setBackgroundColor(0xFFFFDB58);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(0xFFADDFFF);
                return true;
            case R.id.itemPurple:
                baseLayout.setBackgroundColor(0xFFE0B0FF);
                return true;
            case R.id.itemPink:
                baseLayout.setBackgroundColor(0xFFFDD7E4);
                return true;
        }
        return false;
    }
}
