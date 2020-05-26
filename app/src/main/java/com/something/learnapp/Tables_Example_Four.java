package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.Tables.TablesContent;

public class Tables_Example_Four extends AppCompatActivity {
    Button tablessomethingfourback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables__example__four);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tablessomethingfourback = (Button) findViewById(R.id.tables_ex_four_back_btn);
        tablessomethingfourback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetotablescontentback = new Intent(Tables_Example_Four.this, TablesContent.class);
                startActivity(movetotablescontentback);

            }
        });

    }
}
