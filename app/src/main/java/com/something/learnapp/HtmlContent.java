package com.something.learnapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.something.learnapp.Forms.FormsContent;
import com.something.learnapp.Tables.TablesContent;

public class HtmlContent extends AppCompatActivity {
    ImageButton basics,images,tables,forms,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        forms =(ImageButton) findViewById(R.id.forms_btn);
        forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveform = new Intent(HtmlContent.this,FormsContent.class);
                startActivity(moveform);

            }
        });
        tables = (ImageButton) findViewById(R.id.tables_btn);
        tables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetable = new Intent(HtmlContent.this, TablesContent.class);
                startActivity(movetable);
            }
        });

        basics = (ImageButton) findViewById(R.id.basics_btn);
        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetobasics = new Intent(HtmlContent.this,BasicsContent.class);
                startActivity(movetobasics);
            }
        });

        web = (ImageButton) findViewById(R.id.WEB_btn);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetowebcontent = new Intent(HtmlContent.this,WebContent.class);
                startActivity(movetowebcontent);
            }
        });

        images = (ImageButton) findViewById(R.id.images_btn);
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movetoimages = new Intent(HtmlContent.this,ImagesContent.class);
                startActivity(movetoimages);
            }
        });


    }

}
