package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.Tables.TablesContent;

public class Tables_Example_Three extends AppCompatActivity {
    Button tablessomethingthreeback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables__example__three);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tablessomethingthreeback = (Button) findViewById(R.id.tables_something_three_back_btn);
        tablessomethingthreeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoformscontentthree = new Intent(Tables_Example_Three.this, TablesContent.class);
                startActivity(movetoformscontentthree);
            }
        });

    }
}
