package com.example.seniha.arkaplanrengi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button yesil,mavi, sari;
    RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Butonların tanımlanması
        yesil = (Button) findViewById(R.id.btn_yesil);
        sari = (Button) findViewById(R.id.btn_sari);
        mavi= (Button) findViewById(R.id.btn_mavi);
        //RelativeLayout tanımlanması
        r1= (RelativeLayout)findViewById(R.id.content_main);

        //yeşil butona basıldığında
        yesil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundColor(Color.GREEN); // r1'in rengini değiştirir.

            }
        });

        //mavi butona basıldığında
        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundColor(Color.BLUE);

            }
        });

        //sarı butona basıldığında
        sari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundColor(Color.YELLOW);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
