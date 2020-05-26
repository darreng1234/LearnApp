package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImagesContent extends AppCompatActivity {
    Button imagesback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        imagesback = (Button) findViewById(R.id.images_back_btn);
        imagesback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetocoontent = new Intent(ImagesContent.this,HtmlContent.class);
                startActivity(movetocoontent);
            }
        });
    }
}
