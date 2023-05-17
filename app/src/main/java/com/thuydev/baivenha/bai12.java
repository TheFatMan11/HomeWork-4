package com.thuydev.baivenha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bai12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai12);
        Button btnNext = findViewById(R.id.btn_nut);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen =new Intent(bai12.this,bai21.class);
                startActivity(chuyen);System.exit(0);
            }
        });
    }
}