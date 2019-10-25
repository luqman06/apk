package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class nex2 extends AppCompatActivity {

    private EditText editr,editt;
    private ImageButton cek3,gocek;
    private TextView hasilnex3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nex2);


        editr = findViewById(R.id.nilair);
        editt = findViewById(R.id.nilait);
        cek3 = findViewById(R.id.cek3);
        hasilnex3 = findViewById(R.id.hasilnex2);
        gocek = findViewById(R.id.back);


            cek3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nilair = editr.getText().toString();
                    String nilait = editt.getText().toString();

                    if (!TextUtils.isEmpty(nilair)) {
                        if (!TextUtils.isEmpty(nilait)) {

                            int jari = Integer.parseInt(nilair);
                            int tinggi = Integer.parseInt(nilait);

                            hasilnex3.setText("Menggunakan 22/7 = \n" + 22 / 7 * jari * jari * tinggi);

                        } else {
                            int jari1 = Integer.parseInt(nilair);
                            int tinggi1 = Integer.parseInt(nilait);

                            hasilnex3.setText("Menggunakan 3.14 = \n" + 3.14 * jari1 * jari1 * tinggi1);
                        }


                    }
                }

                });




        gocek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(nex2.this,getstarter.class);
                startActivity(u);
            }
        });
    }


    }
