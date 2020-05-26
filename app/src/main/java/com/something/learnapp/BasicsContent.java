package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicsContent extends AppCompatActivity {
    Button basicsback,somethingone,somethingtwo,somethingthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        basicsback = (Button) findViewById(R.id.basics_back_btn);
        basicsback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetomain = new Intent(BasicsContent.this,HtmlContent.class);
                startActivity(movetomain);
            }
        });

        somethingone = (Button) findViewById(R.id.basics_something_one);
        somethingone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoexbone = new Intent(BasicsContent.this,BasicsExampleOne.class);
                startActivity(movetoexbone);
            }
        });

        somethingtwo = (Button) findViewById(R.id.basics_something_two);
        somethingtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetosomethingtwobasics = new Intent(BasicsContent.this,Basics_Example_Two.class);
                startActivity(movetosomethingtwobasics);
            }
        });

        somethingthree = (Button) findViewById(R.id.basics_something_three);
        somethingthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetosomethingthreebasics = new Intent(BasicsContent.this,Basics_Example_Three.class);
                startActivity(movetosomethingthreebasics);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
