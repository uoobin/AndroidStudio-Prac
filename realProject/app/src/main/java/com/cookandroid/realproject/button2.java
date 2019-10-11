package com.cookandroid.realproject;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class button2 extends AppCompatActivity {
    private int CURRENT_INDEX;
    private Button[] Buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        setTitle("동탄알리미 > 동탄 랜드마크");
        Button Button2_1 = (Button) findViewById(R.id.image2_1);
        Button Button2_2 = (Button) findViewById(R.id.image2_2);
        Button Button2_3 = (Button) findViewById(R.id.image2_3);
        Button Button2_4 = (Button) findViewById(R.id.image2_4);
        Button Button2_5 = (Button) findViewById(R.id.image2_5);
        Button Button2_6 = (Button) findViewById(R.id.image2_6);

        Buttons = new Button[]{Button2_1, Button2_2, Button2_3, Button2_4, Button2_5, Button2_6};
        Button2_1.setVisibility(View.VISIBLE);
        CURRENT_INDEX = 0;

        Button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg1 = new AlertDialog.Builder(button2.this);
                dlg1.setTitle("메타폴리스");
                dlg1.setMessage("설명 : 동탄 1신도시에 있는 초고층 주상복합 건물 \n 구성 : 아파트(1,266세대), 센터포인트몰(엔터식스, 홈플러스, CGV 등) \n 특징 : 경기도에서 가장 높은 건물, 66층으로 63빌딩 보다 층수가 많음");
                dlg1.setPositiveButton("확인", null);
                dlg1.show();
            }
        });

        Button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg2 = new AlertDialog.Builder(button2.this);
                dlg2.setTitle("동탄 호수공원");
                dlg2.setMessage("설명 : 동탄 2신도시에있는 호수공원 \n 구성 : 더루나, 운답원, 창포원, 네스트가든 등 \n 특징 : 전체 면적(1,818,000m²), 공원 및 녹지면적(739,000m²)");
                dlg2.setPositiveButton("확인", null);
                dlg2.show();
            }
        });

        Button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg3 = new AlertDialog.Builder(button2.this);
                dlg3.setTitle("센트럴파크");
                dlg3.setMessage("설명 : 동탄 1신도시에있는 공원 \n 구성 : 축구장, 놀이터, 암벽체험장 등 \n 특징 : 주변에 맛집이 많으며 산책하기 좋음");
                dlg3.setPositiveButton("확인", null);
                dlg3.show();
            }
        });

        Button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg4 = new AlertDialog.Builder(button2.this);
                dlg4.setTitle("동탄복합문화센터");
                dlg4.setMessage("설명 : 동탄 1신도시에 있는 복합문화센터 \n 구성 : 야외공연장, 수영장, 반석아트홀, 동탄아트스페이스 등 \n 특징 : 지역학생들을 위한 열람실 제공, 문화 공연 관람하기 용이");
                dlg4.setPositiveButton("확인", null);
                dlg4.show();
            }
        });

        Button2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg5 = new AlertDialog.Builder(button2.this);
                dlg5.setTitle("나래울종합사회복지관");
                dlg5.setMessage("설명 : 동탄 1신도시에 있는 종합사회복지관 \n 구성 : 댄스동아리실, 노래방, 게이트볼장, 도서관 등 \n 특징 : 장애인, 청소년을 위한 행사가 많음, 노래방과 당구장이 30분에 1000원 ");
                dlg5.setPositiveButton("확인", null);
                dlg5.show();
            }
        });

        Button2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg6 = new AlertDialog.Builder(button2.this);
                dlg6.setTitle("동탄국제고등학교");
                dlg6.setMessage("설명 : 동탄 1신도시에 있는 국제고등학교 \n 특징 : 드라마 '상속자들' 촬영지, 모든 학생이 태권도를 배움, 급식이 맛있음");
                dlg6.setPositiveButton("확인", null);
                dlg6.show();
            }
        });
    }

    public void onClickNext(View view) {
        if (++CURRENT_INDEX > 5) {
            Toast toast = Toast.makeText(button2.this, "마지막 이미지 입니다.", Toast.LENGTH_SHORT);
            toast.show();

            CURRENT_INDEX--;
        } else {
            for (int i = 0; i < Buttons.length; i++) {
                if (i == CURRENT_INDEX) {
                    Buttons[i].setVisibility(View.VISIBLE);
                } else {
                    Buttons[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    public void onClickPrev(View view) {
        if (--CURRENT_INDEX < 0) {
            Toast toast = Toast.makeText(button2.this, "처음 이미지 입니다.", Toast.LENGTH_SHORT);
            toast.show();

            CURRENT_INDEX++;
        } else {
            for (int i = 0; i < Buttons.length; i++) {
                if (i == CURRENT_INDEX) {
                    Buttons[i].setVisibility(View.VISIBLE);
                } else {
                    Buttons[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }
}
