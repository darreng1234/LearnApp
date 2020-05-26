package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebContent extends AppCompatActivity {
    Button webback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        webback =(Button) findViewById(R.id.web_back_btn);
        webback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetomain = new Intent(WebContent.this,HtmlContent.class);
                startActivity(movetomain);
            }
        });
    }
}
