package com.something.learnapp.Forms;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.something.learnapp.HtmlContent;
import com.something.learnapp.R;

public class FormsContent extends AppCompatActivity {
    Button fsomethingone,fsomethingtwo,fsomethingthree,formback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_content);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        fsomethingone =(Button)findViewById(R.id.something_one_btn);
        fsomethingone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formone = new Intent(FormsContent.this, FormExampleOne.class);
                startActivity(formone);

            }
        });

        fsomethingtwo =(Button)findViewById(R.id.something_two_btn);
        fsomethingtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formtwo = new Intent(FormsContent.this, FormExampleTwo.class);
                startActivity(formtwo);


            }
        });

        fsomethingthree =(Button)findViewById(R.id.something_three_btn);
        fsomethingthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formthree = new Intent(FormsContent.this, FormExampleThree.class);
                startActivity(formthree);

            }
        });

        formback =(Button)findViewById(R.id.form_back_btn);
        formback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formsback =new Intent(FormsContent.this,HtmlContent.class);
                startActivity(formsback);

            }
        });

    }

}
