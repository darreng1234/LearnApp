package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basics_Example_Two extends AppCompatActivity {
    Button BasicsExTwoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics__example__two);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        BasicsExTwoBack = (Button) findViewById(R.id.Basics_something_Two_Back);
        BasicsExTwoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoBasicsContentTwo = new Intent(Basics_Example_Two.this,BasicsContent.class);
                startActivity(movetoBasicsContentTwo);
            }
        });
    }
}
