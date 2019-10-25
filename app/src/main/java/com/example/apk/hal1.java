package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class hal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        //Inisialisasi dan deklarasi
        TextView textView = findViewById(R.id.teksView);

        //menambah menthod Scroling agar TextView dapat tampil
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
