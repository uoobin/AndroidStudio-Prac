package com.cookandroid.tabhost;

import android.os.Bundle;
import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.imageView1);
        tabHost.addTab(tabSpecDog);

        TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecDog.setContent(R.id.imageView2);
        tabHost.addTab(tabSpecCat);

        TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecDog.setContent(R.id.imageView3);
        tabHost.addTab(tabSpecRabbit);

        TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말");
        tabSpecDog.setContent(R.id.imageView4);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}
