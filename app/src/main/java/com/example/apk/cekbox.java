package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class cekbox extends AppCompatActivity {

    CheckBox cekbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cekbox);

        cekbox = findViewById(R.id.cekbox);

        cekbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(cekbox.this,nex.class);
                startActivity(o);
            }
        });
    }
}
