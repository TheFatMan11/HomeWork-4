package com.thuydev.baivenha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bai11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai11);

        Button btnNext = findViewById(R.id.btn_nut);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen =new Intent(bai11.this,bai12.class);
                    startActivity(chuyen);
                System.exit(0);
            }
        });
    }
}