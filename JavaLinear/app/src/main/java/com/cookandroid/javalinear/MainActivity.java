package com.cookandroid.javalinear;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        final EditText edtxt = new EditText(this);
        edtxt.setHint("여기에 입력하세요");
        baseLayout.addView(edtxt);

        Button btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        final TextView txtvw = new TextView(this);
        txtvw.setText("텍스트뷰입니다");
        txtvw.setTextSize(20);
        txtvw.setTextColor(Color.MAGENTA);
        baseLayout.addView(txtvw);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                txtvw.setText(edtxt.getText().toString());
            }
        });
    }
}
