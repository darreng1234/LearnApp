package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicsExampleOne extends AppCompatActivity {

    Button bsomethingone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_example_one);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        bsomethingone =(Button) findViewById(R.id.bsomething_one_back_btn);
        bsomethingone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoBContent = new Intent(BasicsExampleOne.this,BasicsContent.class);
                startActivity(movetoBContent);
            }
        });
    }
}
