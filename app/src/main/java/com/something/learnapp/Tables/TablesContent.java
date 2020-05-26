package com.something.learnapp.Tables;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.HtmlContent;
import com.something.learnapp.R;
import com.something.learnapp.TablesExampleOne;
import com.something.learnapp.TablesExampleTwo;
import com.something.learnapp.Tables_Example_Four;
import com.something.learnapp.Tables_Example_Three;

public class TablesContent extends AppCompatActivity {
    Button somethingone,somethingtwo,somethingthree,tablessomethingfour,tablesback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        somethingone = (Button) findViewById(R.id.tables_ex_one);
        somethingone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tablessomethingmoveone = new Intent(TablesContent.this, TablesExampleOne.class);
                startActivity(tablessomethingmoveone);
            }
        });
        somethingtwo = (Button) findViewById(R.id.tables_ex_two);
        somethingtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tablessomethingmovetwo = new Intent(TablesContent.this, TablesExampleTwo.class);
                startActivity(tablessomethingmovetwo);

        }
    });

        somethingthree = (Button) findViewById(R.id.tables_ex_three_btn);
        somethingthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetotablesexthree = new Intent(TablesContent.this, Tables_Example_Three.class);
                startActivity(movetotablesexthree);
            }
        });

        tablessomethingfour = (Button) findViewById(R.id.tables_ex_four_btn);
        tablessomethingfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoexfourtables = new Intent(TablesContent.this, Tables_Example_Four.class);
                startActivity(movetoexfourtables);
            }
        });

        tablesback = (Button) findViewById(R.id.tables_back_btn);
        tablesback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetomaincontent = new Intent(TablesContent.this, HtmlContent.class);
                startActivity(movetomaincontent);
            }
        });

    }
}
