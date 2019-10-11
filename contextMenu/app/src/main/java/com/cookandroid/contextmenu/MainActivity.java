package com.cookandroid.contextmenu;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView nickName, age, movieName;
    EditText dlgEdtnickName, dlgEdtAge, movieEdt;
    DatePicker movieDate;
    TextView toastText, year, month, day;
    View dialogView, toastView;
    int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화 순위 및 감상평 입력");
        button1 = (Button) findViewById(R.id.button1);
        registerForContextMenu(button1);
        button2 = (Button) findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v == button1){
            menu.setHeaderTitle("상영하는 영화보기");

            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v == button2){
            menu.setHeaderTitle("영화 감상평 쓰기");

            mInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.itemPop:

                return true;
            case R.id.itemRate:

                return true;
            case R.id.itemName:

                return true;
            case R.id.userInfo:

                return true;
            case R.id.movieInfo:
                /*
                setTitle("영화 정보 입력");
                movieEdt = (EditText) findViewById(R.id.movieEdt);
                movieDate = (DatePicker) findViewById(R.id.movieDate);
                year = (TextView) findViewById(R.id.year);
                month = (TextView) findViewById(R.id.month);
                day = (TextView) findViewById(R.id.day);
                movieName.setText(movieEdt.getText().toString());
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        year.setText(Integer.toString(selectYear));
                        month.setText(Integer.toString(selectMonth));
                        day.setText(Integer.toString(selectDay));
                    }
                });
                DatePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onSelectedDayChange(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        selectYear = year;
                        selectMonth = monthOfYear + 1;
                        selectDay = dayOfMonth;
                    }
                });*/
                return true;
            case R.id.movieRate:
                button2.setScaleX(2);
                return true;
        }
        return false;
    }
}


