package com.cookandroid.myproject;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class button1_1 extends AppCompatActivity {
    private int CURRENT_INDEX;
    private ImageView[] imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1_1);
        init();
    }

    private void init(){
        ImageView imageView1_1 = (ImageView) findViewById(R.id.image1_1);
        ImageView imageView1_2 = (ImageView) findViewById(R.id.image1_2);
        ImageView imageView1_3 = (ImageView) findViewById(R.id.image1_3);
        ImageView imageView1_4 = (ImageView) findViewById(R.id.image1_4);
        ImageView imageView1_5 = (ImageView) findViewById(R.id.image1_5);

        imageViews = new ImageView[]{imageView1_1, imageView1_2, imageView1_3, imageView1_4, imageView1_5};
        imageView1_1.setVisibility(View.VISIBLE);
        CURRENT_INDEX = 0;
    }

    public void onClickNext(View view) {
        if (++CURRENT_INDEX > 4) {
            Toast toast = Toast.makeText(button1_1.this, "마지막 이미지 입니다.", Toast.LENGTH_SHORT);
            toast.show();

            CURRENT_INDEX--;
        } else {
            for (int i = 0; i < imageViews.length; i++) {
                if (i == CURRENT_INDEX) {
                    imageViews[i].setVisibility(View.VISIBLE);
                } else {
                    imageViews[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    public void onClickPrev(View view){
        if( --CURRENT_INDEX < 0) {
            Toast toast = Toast.makeText(button1_1.this, "처음 이미지 입니다.", Toast.LENGTH_SHORT );
            toast.show();

            CURRENT_INDEX++;
        }
        else{
            for( int i = 0; i < imageViews.length; i++){
                if( i == CURRENT_INDEX){
                    imageViews[i].setVisibility(View.VISIBLE);
                } else{
                    imageViews[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }
}