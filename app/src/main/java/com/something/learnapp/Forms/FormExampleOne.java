package com.something.learnapp.Forms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.R;

public class FormExampleOne extends AppCompatActivity {
    Button fexback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_example_one);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fexback = (Button) findViewById(R.id.form_something_one_back);
        fexback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formoneback = new Intent(FormExampleOne.this, com.something.learnapp.Forms.FormsContent.class);
                startActivity(formoneback);


            }
        });
    }
}
