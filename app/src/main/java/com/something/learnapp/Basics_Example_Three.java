package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basics_Example_Three extends AppCompatActivity {
    Button bsomethingthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics__example__three);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bsomethingthree = (Button) findViewById(R.id.Basics_something_Three_Back);
        bsomethingthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoBasicsContentThree = new Intent(Basics_Example_Three.this,BasicsContent.class);
                startActivity(movetoBasicsContentThree);
            }
        });
    }
}
