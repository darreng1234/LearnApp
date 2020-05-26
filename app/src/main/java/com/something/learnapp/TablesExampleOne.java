package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.Tables.TablesContent;

public class TablesExampleOne extends AppCompatActivity {
    Button tableexbackone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables_example_one);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tableexbackone =(Button) findViewById(R.id.tables_ex_one_back_btn);
        tableexbackone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tablesexonebackmove =  new Intent(TablesExampleOne.this, TablesContent.class);
                startActivity(tablesexonebackmove);
            }
        });

    }
}
