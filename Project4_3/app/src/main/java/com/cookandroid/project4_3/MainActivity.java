package com.cookandroid.project4_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoNuga, rdoOreo, rdoPie;
    Button btnFinish, btnStart;
    ImageView imgAnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 버전 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (Switch) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoNuga = (RadioButton) findViewById(R.id.RdoNuga);
        rdoOreo = (RadioButton) findViewById(R.id.RdoOreo);
        rdoPie = (RadioButton) findViewById(R.id.RdoPie);

        btnFinish = (Button) findViewById(R.id.BtnFinish);
        btnStart = (Button) findViewById(R.id.BtnStart);
        imgAnd = (ImageView) findViewById(R.id.ImgAnd);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(chkAgree.isChecked() == true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnFinish.setVisibility(android.view.View.VISIBLE);
                    btnStart.setVisibility(android.view.View.VISIBLE);
                    imgAnd.setVisibility(android.view.View.VISIBLE);
                }else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    btnFinish.setVisibility(android.view.View.INVISIBLE);
                    btnStart.setVisibility(android.view.View.INVISIBLE);
                    imgAnd.setVisibility(android.view.View.INVISIBLE);
                }

                rdoNuga.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        imgAnd.setImageResource(R.drawable.nougat);
                    }
                });

                rdoOreo.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        imgAnd.setImageResource(R.drawable.oreo);
                    }
                });

                rdoPie.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        imgAnd.setImageResource(R.drawable.pie);
                    }
                });

                btnStart.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View arg0){
                        text2.setVisibility(android.view.View.INVISIBLE);
                        rGroup1.setVisibility(android.view.View.INVISIBLE);
                        imgAnd.setVisibility(android.view.View.INVISIBLE);
                        btnFinish.setVisibility(android.view.View.INVISIBLE);
                        btnStart.setVisibility(android.view.View.INVISIBLE);

                        rGroup1.clearCheck();
                        chkAgree.setChecked(false);
                    }
                });

                btnFinish.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View arg0){
                        finishAffinity();
                    }
                });
            }
        });
    }
}
