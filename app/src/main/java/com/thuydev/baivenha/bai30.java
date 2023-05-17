package com.thuydev.baivenha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bai30 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai30);
        Button btnNext = findViewById(R.id.btn_nut);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyen =new Intent(bai30.this,bai31.class);
                startActivity(chuyen);System.exit(0);
            }
        });
    }
}
