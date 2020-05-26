package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.Tables.TablesContent;

public class TablesExampleTwo extends AppCompatActivity {
    Button tablesextwoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables_example_two);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tablesextwoback = (Button) findViewById(R.id.tables_ex_two_back_btn);
        tablesextwoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TablessomethingBackmove = new Intent(TablesExampleTwo.this, TablesContent.class);
                startActivity(TablessomethingBackmove);
            }
        });
    }
}
