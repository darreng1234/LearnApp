package com.something.learnapp.Forms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.R;

public class FormExampleTwo extends AppCompatActivity {
    Button fexbacktwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_example_two);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fexbacktwo =(Button) findViewById(R.id.form_something_two_back);
        fexbacktwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formbacktwo = new Intent(FormExampleTwo.this,FormsContent.class);
                startActivity(formbacktwo);

            }
        });
    }
}
