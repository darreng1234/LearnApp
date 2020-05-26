package com.something.learnapp.Forms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.R;

public class FormExampleThree extends AppCompatActivity {
    Button fexthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_example_three);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fexthree = (Button) findViewById(R.id.form_something_three_btn);
        fexthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formexbackthree = new Intent(FormExampleThree.this,FormsContent.class);
                startActivity(formexbackthree);


            }
        });
    }
}
